package com.learn.cloud.april.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = {"com.learn.cloud.april"})
@EnableDiscoveryClient
@SpringBootApplication
public class AprilUserServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AprilUserServerApplication.class, args);
    }
}
