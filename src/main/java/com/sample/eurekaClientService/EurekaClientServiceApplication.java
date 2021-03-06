package com.sample.eurekaClientService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientServiceApplication.class, args);
	}

}
