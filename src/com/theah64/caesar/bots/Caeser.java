package com.theah64.caesar.bots;

/**
 * Created by shifar on 7/3/16.
 */
public class Caeser {
    private static final String PRIVACY_LOCK_MESSAGE = "I can't talk about my creator in his absence.";

    public static String think(String sourceBuddyMessage) {
        sourceBuddyMessage = sourceBuddyMessage.toLowerCase();
        if (sourceBuddyMessage.contains("shifar")) {
            return PRIVACY_LOCK_MESSAGE;
        }
        return null;
    }
}
