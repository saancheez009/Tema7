package ejercicio4;

public class Artículo {
	
	/**
	 * Nombre del artículo
	 */
	 String nombre;
	/**
	 * precio del artículo
	 */
	 int precio;
	 /**
	  * Variable global estática que es el IVA , ya que no cambia su valor
	  */
	 static final double IVA=0.21;
	 /**
	  * cantidad de artículos que quedan en el almacén 
	  */
	 int cuantosQuedan;
	 
	 public Articulo(String nombre, int precio, double IVA, int cuantosQuedan) {
	        this.nombre = nombre;
	        this.precio = precio;
	        this.iva = 0.21;
	        this.cuantosQuedan = cuantosQuedan;
	    }
	    public void imprimir(){
	        System.out.println("Nombre: " + nombre + ", precio: " + precio + ",IVA: " + IVA + ", quedan en almacén: " + cuantosQuedan);
	    }
	    public int getPVP(){
	        int num = (precio*IVA)/100;
	        precio += num;
	        return precio;
	    }
	    public int getPVPDescuento(int descuento){
	        int desc = (precio*descuento)/100;
	        precio += desc;
	        return precio;
	    }
	    public boolean vender(int x){
	        boolean vendido = false;
	        if (cuantosQuedan-x>0){
	            vendido = true;
	            cuantosQuedan-=x;
	        }
	        return vendido;
	    }
	    public void almacenar(int x){
	        cuantosQuedan+=x;
	    }
	 
	 
	 
	 
	 

}
