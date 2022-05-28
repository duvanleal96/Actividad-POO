package com.sofka.software;

import java.util.logging.Logger;

public class Message {
    private static final Logger logger = Logger.getLogger(String.valueOf(Message.class));

    public static Message getInstance() {
        return new Message();
    }

    public void dogAction() {
        logger.info("guau");
    }

    public void catAction() {logger.info("miau");}
}


