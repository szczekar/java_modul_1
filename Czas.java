package pl.modulpierwszy_java;

import java.util.Scanner;

public class Czas {

	public static void main(String[] args) {

		int sekundy = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Podaj liczbe sekund:");
		sekundy = input.nextInt();

		int godziny = sekundy / 3600;
		sekundy = sekundy % 3600;
		int minuty = sekundy / 60;
		sekundy = sekundy % 60;

		System.out.println("To tyle samo co: " + godziny + " godzin, " + minuty + " minut, " + sekundy + " sekund");

		input.close();

	}
}
