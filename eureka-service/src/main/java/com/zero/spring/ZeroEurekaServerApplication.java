package com.zero.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zero-j
 */
@EnableEurekaServer
@SpringBootApplication
public class ZeroEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZeroEurekaServerApplication.class, args);
	}
}
