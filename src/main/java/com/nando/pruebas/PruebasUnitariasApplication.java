package com.nando.pruebas;

import com.nando.pruebas.calculator.Calculator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class PruebasUnitariasApplication {

	public static void main(String[] args) {
				
		SpringApplication.run(PruebasUnitariasApplication.class, args);

		log.warn(Integer.toString(Calculator.div(10,2)));
		
		
	
	}

}
