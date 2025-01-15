package com.example.bookservicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BookServiceDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookServiceDiscoveryApplication.class, args);
    }

}
