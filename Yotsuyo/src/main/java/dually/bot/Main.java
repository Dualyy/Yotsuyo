package dually.bot;


import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;

import javax.security.auth.login.LoginException;

import dually.bot.Commands.PingCommand;


public class Main {

	public static void main(String[] args) {
		System.out.println("wtf is goin gon");
		String token = "NDQzMjg2NTE1NzU0MzM2MjU4.DdW9JA.MqkZfiOaydaYgziNbd1v33al0Os";
		try
        {
            JDA jda = new JDABuilder(AccountType.BOT)
                    .addEventListener(new PingCommand())
            		.setToken(token)           //The token of the account that is logging in.
                    .buildBlocking();  //There are 2 ways to login, blocking vs async. Blocking guarantees that JDA will be completely loaded.
            		
        }
        catch (LoginException e)
        {
            //If anything goes wrong in terms of authentication, this is the exception that will represent it
            e.printStackTrace();
        }
        catch (InterruptedException e)
        {
            //Due to the fact that buildBlocking is a blocking method, one which waits until JDA is fully loaded,
            // the waiting can be interrupted. This is the exception that would fire in that situation.
            //As a note: in this extremely simplified example this will never occur. In fact, this will never occur unless
            // you use buildBlocking in a thread that has the possibility of being interrupted (async thread usage and interrupts)
            e.printStackTrace();
        }
		
		
		
	}

}
