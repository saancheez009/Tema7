package Ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Esta variable es la opción introducida por el usuario
		int opcion;
		//Cantidad de dinero que desea sacar o ingresar a su cuenta
		int cantidad;
		
		//Importamos el scanner para poder leer el teclado
		Scanner sc = new Scanner (System.in);
		
		//Creamos un objeto para llamar la función
		CuentaCorriente cuenta = new CuentaCorriente("09236037L", "Britany", 200);
		
		//Mostramos al usuario las opciones que tiene
		System.out.println("Seleccione la operación que desea realizar");
		System.out.println("1. Sacar dinero");
		System.out.println("2. Ingresar dinero" );
		opcion=sc.nextInt(); //Leemos la opcion que introduce el usuario
		
		//
		switch(opcion) {
		case 1: //Si el usuario introduce 1 , será para retirar dinero, se recogen los datos correspondientes
			//y se le muestra la información de la cuenta 
			
			System.out.println("Por favor ingrese la cantidad a retirar: ");
			cantidad=sc.nextInt();
			cuenta.sacarDinero( cantidad);
			System.out.println(cuenta.mostrarInformacion());
			break;
			
		case 2:
			//Si el usuario introduce 2 , será para ingresar dinero, se recogen los datos correspondientes
			//y se le muestra la información de la cuenta.
			
			System.out.println("Por favor ingrese la cantidad a ingresar: ");
			cantidad=sc.nextInt();
			cuenta.ingresarDinero(cantidad);
			System.out.println(cuenta.mostrarInformacion());
		break;
		}
		
		sc.close(); //cerramos el scanner
		
	}

	

}
