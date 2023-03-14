package Ejercicio2;

import java.util.Scanner;

public class MainLibro {

	public static void main(String[] args) {
		
		int opcion;
		
		Scanner sc = new Scanner(System.in);
		
		Libro libro = new Libro();
		System.out.println("Por favor elija una de las siguientes opciones: ");
		System.out.println("1. Realizar un préstamo ");
		System.out.println("2. Realizar una devolución ");
		opcion=sc.nextInt();
		
		switch(opcion) {
		case 1:
			System.out.println("Por favor introduzca los libros que desea tomar prestados");
			System.out.println (libro.prestamo());
			break;
		
		case 2:
			System.out.println("Cuántos libros desea devolver");
			System.out.println(libro.devolucion());
			break;
		}
	}

}
