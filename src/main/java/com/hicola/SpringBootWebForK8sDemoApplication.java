package com.hicola;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootWebForK8sDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebForK8sDemoApplication.class, args);
    }

}
