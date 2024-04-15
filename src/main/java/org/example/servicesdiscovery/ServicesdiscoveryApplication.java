package org.example.servicesdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServicesdiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicesdiscoveryApplication.class, args);
    }

}
