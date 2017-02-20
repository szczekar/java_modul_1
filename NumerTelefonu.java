package pl.modulpierwszy_java;

import java.util.Random;

public class NumerTelefonu {

	public static void main(String[] args) {

		Random wylosowana = new Random();
		// telefon wedlug schematu 0XXX-ZXXXXX

		int two = wylosowana.nextInt(10);
		int three = wylosowana.nextInt(10);
		int four = wylosowana.nextInt(10);

		int five = wylosowana.nextInt(10) + 1; // nie moze byc wylosowane zero
		int six = wylosowana.nextInt(10);
		int seven = wylosowana.nextInt(10);
		int eight = wylosowana.nextInt(10);
		int nine = wylosowana.nextInt(10);
		int ten = wylosowana.nextInt(10);

		System.out.println("0" + two + three + four + "-" + five + six + seven + eight + nine + ten);

	}

}
