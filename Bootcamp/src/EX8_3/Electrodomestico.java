package EX8_3;

public class Electrodomestico {
		
		final double PRECIO_CONST = 100;
		final Color COLOR_CONST = Color.blanco;
		final Consumo LETRA_CONST = Consumo.F;
		final double PESO_CONST = 5;
		
		enum Consumo {
			A, B, C, D, E, F
		}
		
		enum Color {
			blanco, negro, rojo, azul, gris
			
		}
		public double precio;
		public Color colorin;
		public Consumo letra;
		public double peso;
		
		public Electrodomestico() {
			this.precio= PRECIO_CONST;
			this.colorin = COLOR_CONST;
			this.letra = LETRA_CONST;
			this.peso = PESO_CONST;
			
		}
		public Electrodomestico(double precio, double peso) {
			super();
			this.precio = precio;
			this.peso = peso;
			this.colorin = COLOR_CONST;
			this.letra = LETRA_CONST;
			
		}
		public Electrodomestico(double precio, Color colorin, Consumo letra, double peso) {
			super();
			this.precio = precio;
			this.colorin = colorin;
			this.letra = letra;
			this.peso = peso;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}

		public Color getColorin() {
			return colorin;
		}

		public void setColorin(Color colorin) {
			this.colorin = colorin;
		}

		public Consumo getLetra() {
			return letra;
		}

		public void setLetra(Consumo letra) {
			this.letra = letra;
		}

		public double getPeso() {
			return peso;
		}

		public void setPeso(double peso) {
			this.peso = peso;
		}
		
		public String toString() {
			return "Electrodomestico: El precio=" + precio + ", color=" + colorin + ", letra=" + letra + " y peso=" + peso
					+ "]";
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}
