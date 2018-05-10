package dually.bot.Commands;

import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.entities.ChannelType;
import net.dv8tion.jda.core.entities.Guild;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.TextChannel;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class PingCommand extends ListenerAdapter {
	
	void onMessageRecieved(MessageReceivedEvent event) {
		JDA jda = event.getJDA();
		User author = event.getAuthor();
		Message message =event.getMessage();
		String msg = message.getContentDisplay();
		MessageChannel channel = event.getChannel();
		System.out.println("recieved msg");
		if(event.isFromType(ChannelType.TEXT)) {
			Guild guild =event.getGuild();
			TextChannel textchannel = event.getTextChannel();
			System.out.println(guild + " " + textchannel + " " + msg + " " + author);
		}
		if(msg.equals("!ping")) {
			channel.sendMessage("pong").queue();
		}
	}

}
