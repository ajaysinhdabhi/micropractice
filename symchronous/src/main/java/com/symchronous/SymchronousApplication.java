package com.symchronous;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;


@SpringBootApplication
@EnableAsync
public class SymchronousApplication {

	public static void main(String[] args) {
		SpringApplication.run(SymchronousApplication.class, args);
	}

	
}