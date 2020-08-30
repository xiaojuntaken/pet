package com.hxj.admin_manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AdminManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminManageApplication.class, args);
    }

}
