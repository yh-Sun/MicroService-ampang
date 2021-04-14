package com.ampang.correct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.ampang.order.*")
public class CorrectApplicationA1 {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "a1");
        SpringApplication.run(CorrectApplicationA1.class, args);
    }

}
