package EX8_2;

public class Password {

	private int longitud;
	private String contrase�a = "";
	
	public Password() {}
	
	public Password(int longitud) {
		this.longitud = longitud;
	}

	public String generarContrase�a() {
		
		int [] generador = new int[longitud];
		
		for(int i = 0; i<generador.length; i++) {
			generador[i] =(int)(Math.random()*10);
			contrase�a += generador[i]+"z"+i;
		}	
		return contrase�a;
	}

	public String toString() {
		return "La contrase�a generada es " + generarContrase�a();
	}
	
	
	
}