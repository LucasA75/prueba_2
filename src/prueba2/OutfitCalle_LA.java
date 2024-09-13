package prueba2;

public class OutfitCalle_LA extends Outfit_LA{
	
	private String lentesDeSol_la;
	private String cadena_la;
	private String mochila_la;

	public OutfitCalle_LA(String sombrero,String ropaInterior,String polera,String pantalon, String zapatillas,String cadena,String lentesDeSol,String mochila) {
		super(polera,ropaInterior);
		this.setSombrero_la(sombrero);
		this.setPantalon_la(pantalon);
		this.setZapatillas_la(zapatillas);
		this.cadena_la = cadena;
		this.lentesDeSol_la = lentesDeSol;
		this.mochila_la = mochila;
	}

	public String getLentesDeSol_la() {
		return lentesDeSol_la;
	}

	public void setLentesDeSol_la(String lentesDeSol_la) {
		this.lentesDeSol_la = lentesDeSol_la;
	}

	public String getCadena_la() {
		return cadena_la;
	}

	public void setCadena_la(String cadena_la) {
		this.cadena_la = cadena_la;
	}

	public String getMochila_la() {
		return mochila_la;
	}

	public void setMochila_la(String mochila_la) {
		this.mochila_la = mochila_la;
	}
	
	@Override
	public String mostrarOutFit() {
		String mostarLoPuesto = "Mostar: " + lentesDeSol_la + "\n ";
		mostarLoPuesto += "Mostar: " + cadena_la + "\n ";
		mostarLoPuesto += "Mostar: " + mochila_la + "\n ";
		mostarLoPuesto += "Mostar: " + pantalon_la + "\n ";
		mostarLoPuesto += "Mostar: " + polera_la + "\n ";
		mostarLoPuesto += "Mostar: " + sombrero_la + "\n ";
		mostarLoPuesto += "Mostar: " + zapatillas_la + "\n ";	
		return mostarLoPuesto;
	}
	
	
	
}
