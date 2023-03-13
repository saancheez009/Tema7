package Ejercicio1;

public class CuentaCorriente {

	/**
	 * 
	 */
	String DNI;
	
	/**
	 * 
	 */
	String nombre;
	
	/**
	 * 
	 */
	 double saldo;
	
	CuentaCorriente (String DNI, double saldo){
		this.DNI = DNI;
		
		this.saldo = saldo;
	}
	
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
		
		if (cantidad < saldo) {
			resp=true;
			saldo-=cantidad;
			
		}
		
		return false;
		
	}
	
	/**
	 * 
	 * @param cantidad
	 */
	public void ingresarDinero (double cantidad) {
		saldo+=cantidad;
		
		
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
