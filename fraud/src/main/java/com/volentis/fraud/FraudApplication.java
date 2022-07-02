package com.volentis.fraud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.util.SocketUtils;

@SpringBootApplication
@EnableEurekaClient
public class FraudApplication {
    public static void main(String[] args) {
        int availablePort = SocketUtils.findAvailableTcpPort(8080, 8099);
        System.setProperty("server.port", String.valueOf(availablePort));
        SpringApplication.run(FraudApplication.class, args);
    }
}
