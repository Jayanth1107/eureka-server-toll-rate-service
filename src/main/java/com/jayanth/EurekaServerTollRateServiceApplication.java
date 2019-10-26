package com.jayanth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaServerTollRateServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerTollRateServiceApplication.class, args);
	}

}
