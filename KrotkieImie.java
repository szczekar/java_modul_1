package pl.modulpierwszy_java;

import java.util.Scanner;

public class KrotkieImie {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// wczytyjemy imie i nazwisko z klawiatury
		System.out.print("Podaj swoje imie: ");
		String imie = input.nextLine();
		System.out.print("Podaj swoje nazwisko: ");
		String nazwisko = input.nextLine();

		char litera = imie.charAt(0); // wyciagamy pierwsza litere imienia
		String litery_nazw = nazwisko.substring(0, 4); // wyciagamy pierwsze 4
														// litery nazwiska

		System.out.println(litera + "." + " " + litery_nazw);

		input.close();
	}
}
