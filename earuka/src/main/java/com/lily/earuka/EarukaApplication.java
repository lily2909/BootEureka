package com.lily.earuka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EarukaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EarukaApplication.class, args);
	}

}
