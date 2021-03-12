package com.makersacademy.acebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    // The main() method basically runs the application. The 'entrypoint' to the Java application, if you will.
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
