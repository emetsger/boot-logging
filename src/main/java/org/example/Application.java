package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Elliot Metsger (emetsger@jhu.edu)
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        final SpringApplication app = new SpringApplication(Application.class);
        app.setLogStartupInfo(true);
        app.run(args);
    }

}
