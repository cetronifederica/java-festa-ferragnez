package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		/*creare e inizializzare l’array contenente i nomi degli invitati
		 * chiedere all’utente come si chiama verificare che il nome sia presente nell’array
		 * lasciarlo entrare o rispedirlo cortesemente da dove è venuto
		 */ 

		/*LISTA INVITATI: Dua Lipa, Paris Hilton, Manuel Agnelli, J-Ax, Francesco Totti, 
		 * Ilary Blasi, Bebe Vio, Luis, Pardis Zarei, Martina Maccherone, Rachel Zeilic*/
		
		Scanner scanNomi = new Scanner(System.in);
		
		// genero l'array 
		String[] nomi = {"Dua LIpa", "Paris HIlton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		
		
		// ricerca nome
		String rispostaUtente;
		Scanner scanNome = new Scanner(System.in);
		
		System.out.println("Dimmi il tuo nome: ");
		rispostaUtente = scanNome.nextLine();
		
		//controllo del nome 
		boolean nomeTrovato = false;
		for (int i = 0; i < nomi.length; i++) {
			if (nomi[i].equalsIgnoreCase(rispostaUtente)) {
				nomeTrovato = true;
			}
		}
			if (nomeTrovato) {
				System.out.println("Puoi Entrare");
			} else {
				System.out.println("Non sei invitato");
			}
		
		
		scanNomi.close();
	}

}
