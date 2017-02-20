package pl.modulpierwszy_java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Podaj swoj wzrost w metrach: ");
		double wzrost = input.nextDouble();
		System.out.println("Podaj swoja wage w kg: ");
		int waga = input.nextInt();
		double bmi = (waga / (wzrost * wzrost));

		DecimalFormat myFormat = new DecimalFormat("0");
		String bmiFormat = myFormat.format(bmi);

		System.out.println("Twoje BMI: " + bmiFormat);

		input.close();
	}
}
