import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.security.auth.login.LoginException;

public class Main extends ListenerAdapter {
    public static void main(String[] args) throws LoginException {
        JDA jda= new JDABuilder("NzI0NzU3MzYxMTI1ODgzOTQ0.XvE20A.6aleLpVLC25lwAd6f1xaHBDN1BU").build();
//        String token = "";
//        builder.setToken(token);
        jda.addEventListener(new Main());
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getAuthor().isBot()) return;
        System.out.println("We received a message from" +
                event.getAuthor().getName() + ":" +
                event.getMessage().getContentDisplay());

        if (event.getMessage().getContentRaw().equals("!ping"))
            event.getChannel().sendMessage("!Pong").queue();
    }
}
