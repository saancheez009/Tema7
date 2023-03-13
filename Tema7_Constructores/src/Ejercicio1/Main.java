package Ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int opcion;
		int cantidad;
		
		Scanner sc = new Scanner (System.in);
		
		CuentaCorriente cuenta = new CuentaCorriente("109236037L", "Britany", 200);
		
		System.out.println("Seleccione la operación que desea realizar");
		System.out.println("1. Sacar dinero");
		System.out.println("2. Ingresar dinero" );
		opcion=sc.nextInt();
		
		
		switch(opcion) {
		case 1:
			System.out.println("Por favor ingrese la cantidad a retirar: ");
			cantidad=sc.nextInt();
			
			cuenta.sacarDinero( cantidad);
			System.out.println(cuenta.mostrarInformacion());
			break;
			
		case 2:
		System.out.println("Por favor ingrese la cantidad a ingresar: ");
		cantidad=sc.nextInt();
		cuenta.ingresarDinero(cantidad);
		System.out.println(cuenta.mostrarInformacion());
		break;
		}
		
		System.out.println(cuenta);
	}

	

}
