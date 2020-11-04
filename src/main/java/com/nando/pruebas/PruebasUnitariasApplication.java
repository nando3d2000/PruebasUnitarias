package com.nando.pruebas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class PruebasUnitariasApplication {

	public static void main(String[] args) {
		Persona person=new Persona.PersonaBuilder()
				.nombre("Nando")
				.apellido("Gomez")
				.correo("nando3d@gmail.com")
				.cedula(71225857)
				.build();
				
		SpringApplication.run(PruebasUnitariasApplication.class, args);
		log.warn(person.getNombre()+" "+person.getApellido());
		
		
	
	}

}
