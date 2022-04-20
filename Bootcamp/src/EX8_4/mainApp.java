package EX8_4;

public class mainApp {
		public static void main(String[] args) {
			
			Serie nada = new Serie();
			Serie Lucifer = new Serie("Lucifer", "Pepito Grillo");
			Serie JuegoDeTronos = new Serie("Juego de tronos", 8, "Aventuras", "Alan Taylor");
			
			System.out.println(nada);
			System.out.println(Lucifer);
			System.out.println(JuegoDeTronos);

		}

	}