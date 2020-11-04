package com.nando.pruebas;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@Builder(toBuilder = true)
@ToString
public class Persona {
	
	private String nombre;
	private String apellido;
	private String correo;
	private int cedula;

}
