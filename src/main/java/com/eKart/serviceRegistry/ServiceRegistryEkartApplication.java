package com.eKart.serviceRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryEkartApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryEkartApplication.class, args);
	}

}
