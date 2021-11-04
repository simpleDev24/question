package com.simpledev.questionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 1st way to start this application
@SpringBootApplication

//2nd way to start this application
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan


// No need of @EnableDiscoveryClient annotation anymore for service to register with consul agent. Just include "spring-cloud-starter-consul-discovery" dependency. 
// Now Consul's discovery client implementation is included under @EnableAutoConfiguration (which is under @SpringBootApplication).
public class QuestionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuestionServiceApplication.class, args);
	}

}
