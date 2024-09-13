package prueba2;

public class Main {

	public static void main(String[] args) {
		// construir robot 
		System.out.println("Se comienza a construir el Robot");
		Robot_LA robot_la = new Robot_LA("esqueleto fuerte"
				, new Manos_LA("dedos largos", 5, "Muneca roja", "Si", "Si") 
				, new Cabeza_LA("ojos cafes", "Craneo cuadrado", "Boca de lata", "Sin")
				, new Piernas_LA("Si", "Si", "Pie de palo", "Pie de metal")
				, new Torso_LA("motor electrico", "Pecho de lata", "Barriga de madera"));
		
		System.out.println("Se termina de construir el Robot");
		robot_la.saludar();
		
		OutfitCalle_LA outfitCalle = new OutfitCalle_LA("Sombrero Nike", "Calvin Kerini","Rock and roll negra","jeans negros","Adidas","cadena de plata","rayban", "mochila puma");
		OutfitHogar_LA outfitHogar = new OutfitHogar_LA("Dulces sueños","conejo","De rallas", "Top");
		
		// robot no tiene ropa
		System.out.println(robot_la.modelarOutFit());
		
		//robot se viste
		robot_la.colocarseRopa(outfitCalle);
		System.out.println(robot_la.modelarOutFit());
		
		// cambiarse de ropa
		robot_la.sacarseLaRopa();
		robot_la.colocarseRopa(outfitHogar);
		System.out.println(robot_la.modelarOutFit());
		//Fin del programa
		
	}

}
