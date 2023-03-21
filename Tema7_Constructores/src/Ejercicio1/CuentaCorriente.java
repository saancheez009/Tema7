package Ejercicio1;

public class CuentaCorriente {

	/**
	 *DNI de la persona
	 */
	String DNI;
	
	/**
	 * Nombre de la persona
	 */
	String nombre;
	
	/**
	 * Saldo en la cuenta de la persona 
	 * 
	 */
	 double saldo;
	
	 /**
	  * 
	  * @param DNI
	  * @param saldo
	  */
	CuentaCorriente (String DNI, double saldo){
		this.DNI = DNI;
		this.saldo = saldo;
	}
	/**
	 * 
	 * @param DNI
	 * @param nombre
	 * @param saldo
	 */
	CuentaCorriente (String DNI, String nombre , double saldo){
		this.DNI = DNI;
		this.nombre = nombre;
		this.saldo = saldo;
	}

	/**
	 * 
	 * @param cantidad
	 * @return
	 */
	public boolean sacarDinero (double cantidad) {
		boolean resp = false ; 
		
		if (cantidad < saldo) { //Si la cantidad a sacar es menor que la del saldo, la operación se podrá realizar 
			resp=true;
			saldo-=cantidad; //Al total de dinero que hay en la cuenta se le resta la cantidad sacada
			
		}
		
		return false; 
		
	}
	
	/**
	 * 
	 * @param cantidad
	 */
	public void ingresarDinero (double cantidad) {
		saldo+=cantidad; 
		
		//Para ingresar dinero se le suma a la cantidad de dinero metida en el banco, el importe que el usuario ha introducido
	}
	
	/**
	 * 
	 * @return
	 */
	public String mostrarInformacion () {
		String res="";
		res += "DNI: "+DNI+ "\n";
		res+= "Nombre: "+nombre+"\n";
		res+= "Saldo: "+saldo+"\n";
		return res;
		
	}
}
