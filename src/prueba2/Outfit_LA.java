package prueba2;

public class Outfit_LA {

	
	protected String sombrero_la;
	protected String polera_la;
	protected String pantalon_la;
	protected String zapatillas_la;
	protected String ropaInterior_la;
	
	public Outfit_LA(String polera, String ropaInterior) {
		this.polera_la = polera;
		this.ropaInterior_la = ropaInterior;
	}
	public String getSombrero_la() {
		return sombrero_la;
	}
	public void setSombrero_la(String sombrero_la) {
		this.sombrero_la = sombrero_la;
	}
	public String getPolera_la() {
		return polera_la;
	}
	public void setPolera_la(String polera_la) {
		this.polera_la = polera_la;
	}
	public String getPantalon_la() {
		return pantalon_la;
	}
	public void setPantalon_la(String pantalon_la) {
		this.pantalon_la = pantalon_la;
	}
	public String getZapatillas_la() {
		return zapatillas_la;
	}
	public void setZapatillas_la(String zapatillas_la) {
		this.zapatillas_la = zapatillas_la;
	}
	
	protected String caminar() {
		return "";
	}
	
	protected String bailar() {
		return "";
	}
	
	protected String mostrarOutFit() {
		return "";
	}
}
