package com.learn.cloud.april.food;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 应用程序启动类
 *
 * @author phd
 * @date 2020/11/24.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class AprilFoodServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(AprilFoodServerApplication.class, args);
    }
}