package com.phycctv.easysum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@SpringBootApplication
public class EasySumApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasySumApplication.class, args);
	}

}
