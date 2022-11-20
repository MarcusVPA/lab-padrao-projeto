package com.digitalinnovation.gol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class LabPadraoProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadraoProjetoApplication.class, args);
	}

}
