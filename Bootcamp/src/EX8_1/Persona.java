package EX8_1;

public class Persona {

		private String nombre;
		private int edad;
		private String DNI;
		private String sexo;
		
		public Persona() {
			this.nombre = "default";
			this.edad = 00;
			this.DNI = "default";
			this.sexo = "H";
		}

		private Persona(String nombre, int edad, String sexo) {
			this.nombre = nombre;
			this.edad = edad;
			this.sexo = sexo;
			this.DNI = "default";
		}

		private Persona(String nombre, int edad, String DNI, String sexo) {
			this.nombre = nombre;
			this.edad = edad;
			this.DNI = DNI;
			this.sexo = sexo;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public String getDNI() {
			return DNI;
		}

		public void setDNI(String dNI) {
			DNI = dNI;
		}

		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}

		public String toString() {
			return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + "]";
		}		
		
	}