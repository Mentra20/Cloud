package org.si5.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication app =new SpringApplication(Application.class);

        String port = System.getenv().getOrDefault("PORT", "80");
        app.setDefaultProperties(Collections.singletonMap("server.port", port));

        app.run(args);
    }
}