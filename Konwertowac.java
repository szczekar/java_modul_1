package pl.modulpierwszy_java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Konwertowac {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Podaj temperature w skali Fahrenheita: ");
		double F = input.nextDouble();
		double C = ((F - 32) * 5 / 9);

		DecimalFormat myFormat = new DecimalFormat("0.#"); // z pomoca tej klasy
															// mamy dokladnosc 1
															// miejsca po
															// przecinku
		String CFormat = myFormat.format(C);

		System.out.println(F + " stopni w skali Fahernheita to " + CFormat + " stopni Celsjusza.");

		input.close();
	}
}
