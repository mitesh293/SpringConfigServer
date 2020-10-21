package com.mcs.SpringConfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigserverApplication.class, args);
	}

}
