package EX8_2;

public class Password {

	private int longitud;
	private String contraseña = "";
	
	public Password() {}
	
	public Password(int longitud) {
		this.longitud = longitud;
	}

	public String generarContraseña() {
		
		int [] generador = new int[longitud];
		
		for(int i = 0; i<generador.length; i++) {
			generador[i] =(int)(Math.random()*10);
			contraseña += generador[i]+"z"+i;
		}	
		return contraseña;
	}

	public String toString() {
		return "La contraseña generada es " + generarContraseña();
	}
	
	
	
}