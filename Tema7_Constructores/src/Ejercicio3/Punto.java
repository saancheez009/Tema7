package Ejercicio3;

import java.util.Scanner;

public class Punto {

	
		/**
		 * Coordenada x
		 */
		int x;
		/**
		 * Coordenada y
		 */
		int y;
		
		Scanner sc = new Scanner(System.in);
		
		/**
		 * @param y
		 * @param x
		 */
		public Punto(int y, int x) {
			super();
			this.x = x;
			this.y = y;
		}
		void main(){
		System.out.println("Porfavor introduzca las coordenadas");
		System.out.println("Coordenada x:");
		x=sc.nextInt();
		
		System.out.println("Coordenada y:");
		y=sc.nextInt();
		
		}
		void desplaza(int num1, int num2) {
			x=x+num1;
			y=y+num2;	
			System.out.println("Si se desplaza ("+num1+" , "+num2+"), las coordenadas serán ("+x+" , "+y+")");
		}
		
		void distancia (int num1, int num2) {
			x=num1;
			y=num2;
			System.out.println("La distancia entre las dos coordenadas es("+x+" , "+y+")");
		}
		
		

	}

	

