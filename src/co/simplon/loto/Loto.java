package co.simplon.loto;

import java.util.ArrayList;

public class Loto {

	public static void main(String[] args) {
		
		
		//Création de la grille des 50 chiffres du LOTO
		ArrayList grille= new ArrayList<int[]>();
		
		for (int i=0; i < 50; i++) {
			grille.add(i+1);
		}
		
		
		//Prendre un chiffre au hasard et enlever ce chiffre du tableau initial
		for (int i=1; i<=6; i++) {
			int chiffre=0;
			int result=(int) (Math.random() * grille.size());
			chiffre=(int) grille.get(result);
			System.out.println(chiffre);
			grille.remove(result);
		}
	}

}
