package com.zero.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zero-j
 */
@EnableEurekaClient
@SpringBootApplication
public class ZeroEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZeroEurekaClientApplication.class, args);
	}
}
