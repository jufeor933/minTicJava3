package com.example.demo;

import Entidades.Empleado;
import Entidades.Empresa;
import Entidades.Movimientos;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);

		//Instanciar objeto Empresa
		Empresa empresa1 = new Empresa();
		empresa1.setNombre("Globant");
		System.out.println("Nombre de la empresa: " + empresa1.getNombre());
		empresa1.setDireccion("Calle Falsa 123");
		System.out.println("Direccion de la empresa: " + empresa1.getDireccion());
		empresa1.setTelefono("888-777-1929");
		System.out.println("Telefono de la empresa: " + empresa1.getTelefono());
		empresa1.setNit("1234567-4");
		System.out.println("NIT de la empresa: " + empresa1.getNit());

		System.out.println("*****************************");
		//Instanciar objeto Empleado
		Empleado empleado1 = new Empleado();
		empleado1.setNombre("Juan");
		System.out.println("El nombre del empleado es: " + empleado1.getNombre());
		empleado1.setEmail("jufeor933@gmail.com");
		System.out.println("El correo electronico es: " + empleado1.getEmail());
		empleado1.setEmpresa("Globant");
		System.out.println("El nombre de la empresa es: " + empleado1.getEmpresa());
		empleado1.setRol(true);
		System.out.println("Es Administrador?: " + empleado1.getRol());

		System.out.println("*****************************");
		//Instanciar objeto Movimiento
		Movimientos mov1 = new Movimientos();
		mov1.setMonto(500);
		System.out.println("la cantidad de moviento fue: " + mov1.getMonto());
		mov1.setMonto(-400);
		System.out.println("la cantidad de moviento fue: " + mov1.getMonto());
		mov1.setConcepto("Pago Quincenal Sep.");
		System.out.println("El concepto del anterior pagos es por: " + mov1.getConcepto());
		mov1.setNombre("Juan");
		System.out.println("la persona q hizo el movimiento fue: " + mov1.getNombre());
	}

}
