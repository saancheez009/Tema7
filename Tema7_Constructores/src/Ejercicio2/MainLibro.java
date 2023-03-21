package Ejercicio2;

import java.util.Scanner;

public class MainLibro {

	public static void main(String[] args) {
		//Opción introducida por el usuario
		int opcion;
		//Introducimos e importamos el scanner para poder leer el teclado
		Scanner sc = new Scanner(System.in);
		
		//Creamos un objeto para llamar a la función
		Libro libro = new Libro();
		
		//Le mostramos al usuario las opciones a elegir
		System.out.println("Por favor elija una de las siguientes opciones: ");
		System.out.println("1. Realizar un préstamo ");
		System.out.println("2. Realizar una devolución ");
		//Leemos la opción introducida por el usuario
		opcion=sc.nextInt();
		
		switch(opcion) {
		case 1:
			//Si selecciona la opción 1 se comprobará si podrá realizarse el préstamo
			System.out.println("Por favor introduzca los libros que desea tomar prestados");
			//Se devuelve el resultado a través de la función
			System.out.println (libro.prestamo());
			break;
		
		case 2:
			//Si selecciona la opción 2 se comprobará si se puede hacer la devolución
			System.out.println("Cuántos libros desea devolver");
			//Se devuelve el resultado a través de la función
			System.out.println(libro.devolucion());
			break;
		}
	}

}
