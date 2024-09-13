package prueba2;

public class Robot_LA {

	private String esqueleto_la;
	private Manos_LA manos_la;
	private Cabeza_LA cabeza_la;
	private Piernas_LA piernas_la;
	private Torso_LA torso_la;
	private Outfit_LA outfit_la;
	
	
	public Robot_LA(String esqueleto_la, Manos_LA manos_la, Cabeza_LA cabeza_la, Piernas_LA piernas_la,
			Torso_LA torso_la) {
		super();
		this.esqueleto_la = esqueleto_la;
		this.manos_la = manos_la;
		this.cabeza_la = cabeza_la;
		this.piernas_la = piernas_la;
		this.torso_la = torso_la;
	}
	
	public String getEsqueleto_la() {
		return esqueleto_la;
	}
	public void setEsqueleto_la(String esqueleto_la) {
		this.esqueleto_la = esqueleto_la;
	}
	public Manos_LA getManos_la() {
		return manos_la;
	}
	public void setManos_la(Manos_LA manos_la) {
		this.manos_la = manos_la;
	}
	public Cabeza_LA getCabeza_la() {
		return cabeza_la;
	}
	public void setCabeza_la(Cabeza_LA cabeza_la) {
		this.cabeza_la = cabeza_la;
	}
	public Piernas_LA getPiernas_la() {
		return piernas_la;
	}
	public void setPiernas_la(Piernas_LA piernas_la) {
		this.piernas_la = piernas_la;
	}
	public Torso_LA getTorso_la() {
		return torso_la;
	}
	public void setTorso_la(Torso_LA torso_la) {
		this.torso_la = torso_la;
	}
	
	public void saludar() {
		String response = this.manos_la.moverMano_la();
		System.out.println("Saluda: " + response);
	}
	
	
	public void colocarseRopa(Outfit_LA ropa) {
		this.setOutfit_la(ropa);
		System.out.println("Se coloco la ropa exitosamente");
	}

	public Outfit_LA getOutfit_la() {
		return outfit_la;
	}

	public void setOutfit_la(Outfit_LA outfit_la) {
		this.outfit_la = outfit_la;
	}
	
	public String modelarOutFit() {
		if(outfit_la != null) {
			return this.outfit_la.mostrarOutFit();
		}
		return "No hay outfit";
	}
	
	public void sacarseLaRopa() {
		this.outfit_la = null;
		System.out.println(this.outfit_la);
		System.out.println("Se quito la ropa exitosamente");
	}
	
}
