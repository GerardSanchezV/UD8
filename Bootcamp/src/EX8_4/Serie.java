package EX8_4;

public class Serie {

	private String titulo;
	private int temporadas;
	private boolean entregado;
	private String genero;
	private String creador;

	public Serie() {
		this.titulo = "default";
		this.temporadas = 3;
		this.entregado = false;
		this.genero = "default";
		this.creador = "default";
	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.temporadas = 3;
		this.entregado = false;
		this.genero = "default";
		this.creador = creador;
	}

	public Serie(String titulo, int temporadas, String genero, String creador) {
		this.titulo = titulo;
		this.temporadas = temporadas;
		this.entregado = false;
		this.genero = genero;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public String toString() {
		return "T�tulo=" + titulo + ",temporadas=" + temporadas + ",entregado=" + entregado + ",genero=" + genero
				+ ",creador=" + creador +"";
	}

}