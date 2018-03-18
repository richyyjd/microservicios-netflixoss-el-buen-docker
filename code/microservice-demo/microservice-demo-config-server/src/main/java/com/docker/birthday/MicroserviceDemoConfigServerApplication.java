package com.docker.birthday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MicroserviceDemoConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceDemoConfigServerApplication.class, args);
	}
}
