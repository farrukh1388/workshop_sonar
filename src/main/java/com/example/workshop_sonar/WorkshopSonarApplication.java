package com.example.workshop_sonar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.function.Consumer;

@SpringBootApplication
public class WorkshopSonarApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkshopSonarApplication.class, args);

        System.out.println("Application started");
        String variable = "switch";
        switch (variable) {
            default:
                System.out.println("default");
            case "case1":
                System.out.println("case1");
            case "case2":
                System.out.println("case2");
        }

        Consumer consumer = x -> System.out.println(x);
        consumer.accept("Some string");

        System.out.println("Application stopped");
    }
}
