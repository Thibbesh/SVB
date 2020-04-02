package com.svb.facebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  This class is the entry point for the application
 */

@SpringBootApplication
public class FacebookApplication {

    /**
     * Starts the spring boot application
     * @param args the args passed during start up
     */
    public static void main(String args[]) {
        SpringApplication.run(FacebookApplication.class, args);
    }
}
