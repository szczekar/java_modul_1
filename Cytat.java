package pl.modulpierwszy_java;

import java.util.Scanner;

public class Cytat {

	public static void main(String[] args) {

		System.out.println("Podaj swoj cytat:");
		Scanner input = new Scanner(System.in);

		String text = input.nextLine();
		System.out.print("\"");
		System.out.print(text);
		System.out.print("\"");

		input.close();

	}
}
