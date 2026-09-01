package config;

public class BotConfig {

    // === Token e ID base ===
    public static final String TOKEN = System.getenv("DISCORD_BOT_TOKEN");

    // === Canali ===
    public static final long MOD_LOG_CHANNEL_ID = 0L;       // TODO: canale log moderazione
    public static final long STAFF_APP_CHANNEL_ID = 0L;      // TODO: canale review candidature

    // === Automod ===
    public static final int SPAM_MESSAGE_THRESHOLD = 5;      // messaggi
    public static final long SPAM_TIME_WINDOW_MS = 5000;     // finestra temporale

    public static final String[] BLACKLISTED_WORDS = {
            // TODO: popolare con le parole da filtrare
    };
}