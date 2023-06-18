package com.bob.clientofspringcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication

public class ClientofspringcloudconfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientofspringcloudconfigserverApplication.class, args);
	}

}
