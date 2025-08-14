package com.lala.varun.config_server_ms_prac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
//This helps to transform a regular spring boot application into config server
@EnableConfigServer
@SpringBootApplication
public class ConfigServerMsPracApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerMsPracApplication.class, args);
	}

}
