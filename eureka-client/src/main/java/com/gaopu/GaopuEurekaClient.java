package com.gaopu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GaopuEurekaClient {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(GaopuEurekaClient.class, args);

		while (true) {
			Thread.sleep(1000);
		}
	}

}
