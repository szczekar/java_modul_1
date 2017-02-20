package pl.modulpierwszy_java;

import java.util.Scanner;

public class SumaTrzy {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Podaj liczbe trzycyfrowa: ");
		int liczba = input.nextInt();

		int cyfra1 = liczba / 100;
		int cyfra2 = (liczba / 10)%10;
		int cyfra3 = liczba % 10;
		int suma = cyfra1 + cyfra2 + cyfra3;

		System.out.println("Suma tych cyfr to: " + suma);

		input.close();

	}
}
