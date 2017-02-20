package pl.modulpierwszy_java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Dystans {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Podaj 2 wspolrzedne pierwszego punktu: ");

		System.out.print("Punkt x1: ");
		double x1 = input.nextInt();

		System.out.print("Punkt x2: ");
		double x2 = input.nextInt();

		System.out.println("Podaj 2 wspolrzedne drugiego punktu: ");
		System.out.print("Punkt y1: ");
		double y1 = input.nextInt();

		System.out.print("Punkt y2: ");
		double y2 = input.nextInt();

		double dystans = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

		// chcemy miec 3 miejsca po przecinku
		DecimalFormat myFormat = new DecimalFormat("0.###");
		String Fdystans = myFormat.format(dystans);

		System.out.println("Dystans miedzy punktami wynosi: " + Fdystans);

		input.close();
	}

}