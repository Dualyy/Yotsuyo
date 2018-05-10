package dually.bot.Commands;

import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class PingCommand extends ListenerAdapter {
	
	void onMessageRecieved(MessageReceivedEvent event) {
		
		MessageChannel channel = event.getChannel();
		if(event.getMessage().getContentStripped().equalsIgnoreCase("!ping") && !event.getAuthor().isBot()) {
			channel.sendMessage("pong").queue();
		}
	}

}
