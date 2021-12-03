package com.example.eurika_discovry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurikaDiscovryApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurikaDiscovryApplication.class, args);
    }

}
