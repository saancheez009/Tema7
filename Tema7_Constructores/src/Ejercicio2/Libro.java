package Ejercicio2;

import java.util.Scanner;

public class Libro {

	
		/**
		 * 
		 */
		String titulo;
		/**
		 * 
		 */
		String nombreAutor;
		/**
		 * 
		 */
		double numEjemplares=10;
		/**
		 * 
		 */
		double prestados;

		/**
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		public Libro() {
			super();
			// TODO Auto-generated constructor stub
		}


		/**
		 * 
		 * @param titulo
		 * @param nombreAutor
		 * @param numEjemplares
		 * @param prestados
		 */
		public Libro(String titulo, String nombreAutor, double numEjemplares, double prestados) {
			super();
			this.titulo = titulo;
			this.nombreAutor = nombreAutor;
			this.numEjemplares = numEjemplares;
			this.prestados = prestados;
		}
	
		/**
		 * 
		 * @return
		 */
	boolean prestamo () {
		prestados=sc.nextInt();
		
		boolean estadoPrestamo=false;
		if (prestados<numEjemplares) {
			estadoPrestamo=true;
			prestados++;
			
		}
		return estadoPrestamo;
		
	
	}

	/**
	 * 
	 * @return
	 */
	boolean devolucion () {
		prestados=sc.nextInt();
		boolean estadoDevolucion=false;
		if (prestados>0) {
			estadoDevolucion= true;
			prestados--;
		}
		return estadoDevolucion;
	}
}
