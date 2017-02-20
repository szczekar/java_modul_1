package pl.modulpierwszy_java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Wiatr {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Podaj temperature: ");
		double T = input.nextInt();

		System.out.print("Podaj szybkosc wiatru: ");
		double V = input.nextInt();

		double Rtemp = 13.126667 + 0.6215 * T - 13.924748 * (Math.pow(V, 0.16)) + 0.4875195 * T * (Math.pow(V, 0.16));

		DecimalFormat myFormat = new DecimalFormat("0");
		String Realtemp = myFormat.format(Rtemp);

		System.out.println("Prawdziwa temperatura: " + Realtemp + " stopni Celsjusza");

		input.close();
	}
}
