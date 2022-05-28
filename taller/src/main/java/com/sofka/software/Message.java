package com.sofka.software;

import java.util.logging.Logger;

/**
 * clase mensaje, imprementa los metodos de mostrar mensaje y respuesta de informacion
 */
public class Message {
    private static final Logger logger = Logger.getLogger(String.valueOf(Message.class));
    
    public void dogAction() {
        logger.info("guau");
    }

    public void catAction() {logger.info("miau");}
}


