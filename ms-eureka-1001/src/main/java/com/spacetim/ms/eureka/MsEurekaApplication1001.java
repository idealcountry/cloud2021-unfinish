package com.spacetim.ms.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author spacetim
 * @date 2021/10/12
 * @description
 */
//@SpringBootApplication由spring-boot-dependencies父节点下的spring-boot-starter-web里所集成的spring-boot-autoconfigure
@SpringBootApplication
@EnableEurekaServer
public class MsEurekaApplication1001 {
    public static void main(String[] args) {
        SpringApplication.run(MsEurekaApplication1001.class, args);
    }
}
