package com.enduser.enduser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EnduserApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnduserApplication.class, args);
		System.out.println("** enduser app: updatedLocation **");
	}

}
