package pl.modulpierwszy_java;

import java.util.Scanner;

public class Sekundy {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int hour, minute, second;
		System.out.println("Podaj godzine,minuty i sekundy: ");

		hour = input.nextInt();
		minute = input.nextInt();
		second = input.nextInt();
		int secondSum = hour * 60 * 60 + minute * 60 + second;

		System.out.println("Godziny: " + hour);
		System.out.println("Minuty: " + minute);
		System.out.println("Sekundy: " + second);

		System.out.println("Laczna liczba sekund: " + secondSum);

		input.close();

	}

}
