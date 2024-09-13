package prueba2;

public class Piernas_LA {
	
	private String piernaIzquierda_la;
	private String piernaDerecha_la;
	private String pieIzquierdo_la;
	private String pieDerecho_la;
	
	public Piernas_LA(String piernaIzquierda, String piernaDerecha, String pieIzquierdo, String pieDerecho) {
		super();
		this.piernaIzquierda_la = piernaIzquierda;
		this.piernaDerecha_la = piernaDerecha;
		this.pieIzquierdo_la = pieIzquierdo;
		this.pieDerecho_la = pieDerecho;
	}
	public String getPiernaIzquierda() {
		return piernaIzquierda_la;
	}
	public void setPiernaIzquierda(String piernaIzquierda) {
		this.piernaIzquierda_la = piernaIzquierda;
	}
	public String getPiernaDerecha() {
		return piernaDerecha_la;
	}
	public void setPiernaDerecha(String piernaDerecha) {
		this.piernaDerecha_la = piernaDerecha;
	}
	public String getPieIzquierdo() {
		return pieIzquierdo_la;
	}
	public void setPieIzquierdo(String pieIzquierdo) {
		this.pieIzquierdo_la = pieIzquierdo;
	}
	public String getPieDerecho() {
		return pieDerecho_la;
	}
	public void setPieDerecho(String pieDerecho) {
		this.pieDerecho_la = pieDerecho;
	}
	
}
