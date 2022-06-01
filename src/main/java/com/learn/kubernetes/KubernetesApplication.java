package com.learn.kubernetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class KubernetesApplication {

	public static void main(String[] args) {
		SpringApplication.run(KubernetesApplication.class, args);
	}

}
