package prueba2;

public class OutfitHogar_LA extends Outfit_LA {
	
	private String pantuflas_la;
	private String pillama_la;
	public OutfitHogar_LA(String polera_la,
			String pantuflas_la, String pillama_la, String ropaInterior) {
		super(polera_la,ropaInterior);
		this.pantuflas_la = pantuflas_la;
		this.pillama_la = pillama_la;
	}
	public String getPantuflas_la() {
		return pantuflas_la;
	}
	public void setPantuflas_la(String pantuflas_la) {
		this.pantuflas_la = pantuflas_la;
	}
	public String getPillama_la() {
		return pillama_la;
	}
	public void setPillama_la(String pillama_la) {
		this.pillama_la = pillama_la;
	}
	
	@Override
	public String mostrarOutFit() {
		String mostarLoPuesto = "Mostrar: " + pantuflas_la + "\n ";
		mostarLoPuesto += "Mostrar: " + pillama_la + "\n ";
		mostarLoPuesto += "Mostrar: " + polera_la + "\n ";
		mostarLoPuesto += "Mostrar: " + ropaInterior_la + "\n ";
		return mostarLoPuesto;
	}
}
