package prueba2;

public class Manos_LA {

	private String dedo_la;
	private int numeroDeDedos_la;
	private String muneca_la;
	private String manoIzquierda;
	private String manoDerecha;
	public String getDedo_la() {
		return dedo_la;
	}
	
	public String getManoIzquierda() {
		return manoIzquierda;
	}

	public void setManoIzquierda(String manoIzquierda) {
		this.manoIzquierda = manoIzquierda;
	}

	public String getManoDerecha() {
		return manoDerecha;
	}

	public void setManoDerecha(String manoDerecha) {
		this.manoDerecha = manoDerecha;
	}

	public void setDedo_la(String dedo_la) {
		this.dedo_la = dedo_la;
	}
	public int getNumeroDeDedos_la() {
		return numeroDeDedos_la;
	}
	public void setNumeroDeDedos_la(int numeroDeDedos_la) {
		this.numeroDeDedos_la = numeroDeDedos_la;
	}
	public String getMuneca_la() {
		return muneca_la;
	}
	public void setMuneca_la(String muneca_la) {
		this.muneca_la = muneca_la;
	}
	public Manos_LA(String dedo_la, int numeroDeDedos_la, String muneca_la,String manoIzquierda,String manoDerecha) {
		super();
		this.dedo_la = dedo_la;
		this.numeroDeDedos_la = numeroDeDedos_la;
		this.muneca_la = muneca_la;
		this.manoDerecha = manoDerecha;
		this.manoIzquierda = manoIzquierda;
	}
	
	public String moverMano_la() {
		return "Se mueve la mano";
	}
	
	
}
