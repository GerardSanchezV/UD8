package EX8_2;

public class Password {

	private int longitud;
	private String contraseņa = "";
	
	public Password() {}
	
	public Password(int longitud) {
		this.longitud = longitud;
	}

	public String generarContraseņa() {
		
		int [] generador = new int[longitud];
		
		for(int i = 0; i<generador.length; i++) {
			generador[i] =(int)(Math.random()*10);
			contraseņa += generador[i]+"z"+i;
		}	
		return contraseņa;
	}

	public String toString() {
		return "La contraseņa generada es " + generarContraseņa();
	}
	
	
	
}