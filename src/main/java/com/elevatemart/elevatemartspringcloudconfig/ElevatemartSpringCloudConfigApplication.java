package com.elevatemart.elevatemartspringcloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ElevatemartSpringCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElevatemartSpringCloudConfigApplication.class, args);
	}

}
