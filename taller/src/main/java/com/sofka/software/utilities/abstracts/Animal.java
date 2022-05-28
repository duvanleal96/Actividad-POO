package com.sofka.software.utilities.abstracts;
import java.util.logging.Logger;
public class Animal {
    Logger logger = Logger.getLogger("logger");
    public void caminar(){
        logger.info("ahora caminamos");
    }
}
