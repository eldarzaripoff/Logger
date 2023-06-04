package org.example;

import java.time.LocalDateTime;
import java.util.Date;

public class Logger {
    protected static int num = 1;
    LocalDateTime currentTime = LocalDateTime.now();

    public void log(String msg) {
        System.out.println("[" + currentTime + " " + num++ + "] " + msg);
    }

    private Logger() {
        this.num = num;
    }

    private static Logger logger = null;

    protected static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }

}
