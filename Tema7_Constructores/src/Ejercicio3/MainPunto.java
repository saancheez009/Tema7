package Ejercicio3;

import java.util.Scanner;

public class MainPunto {

	public static void main(String[] args) {
		int num1;
		int num2 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		Punto func = new Punto(num2, num2);
		func.main();
		System.out.println("Por favor introduzca una coordenada para desplazar la coordenada inicial");
		System.out.println("Introduzca x");
		num1=sc.nextInt();
		System.out.println("Introduzca y");
		num2=sc.nextInt();
		
		func.desplaza(num1, num2);
		func.distancia(num1, num2);
		

	}

}
