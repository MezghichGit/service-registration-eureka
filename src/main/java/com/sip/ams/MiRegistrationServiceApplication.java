package com.sip.ams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MiRegistrationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiRegistrationServiceApplication.class, args);
	}

}
