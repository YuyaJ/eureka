package com.nio.artemis.eurekadev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaDevApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaDevApplication.class, args);
	}

}

