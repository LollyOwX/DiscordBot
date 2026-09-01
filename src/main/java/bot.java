package com.lollyowx.discordbot;

import com.lollyowx.discordbot.config.BotConfig;
import com.lollyowx.discordbot.listeners.MessageFilterListener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class Bot {

    public static void main(String[] args) throws InterruptedException {
        JDA jda = JDABuilder.createDefault(BotConfig.TOKEN)
                .enableIntents(
                        GatewayIntent.MESSAGE_CONTENT,
                        GatewayIntent.GUILD_MESSAGES,
                        GatewayIntent.GUILD_MEMBERS
                )
                .addEventListeners(new MessageFilterListener())
                .build();

        jda.awaitReady();
        System.out.println("Bot online come " + jda.getSelfUser().getAsTag());
    }
}