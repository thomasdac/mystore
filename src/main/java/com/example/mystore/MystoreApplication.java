package com.example.mystore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class MystoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(MystoreApplication.class, args);
    }
}
