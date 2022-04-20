package EX8_1;

public class mainApp{


public static void main(String[] args) {
	
	Persona p1 = new Persona();
	Persona p2 = new Persona();
	Persona p3 = new Persona();
	

	p2.setNombre("Gerard");
	p2.setEdad(19);
	p2.setSexo("Hombre");
	

	p3.setNombre("Joana");
	p3.setEdad(20);
	p3.setDNI("567874131");
	p3.setSexo("Mujer");
	

	System.out.println(p1);
	System.out.println(p2);
	System.out.println(p3);

}

}
