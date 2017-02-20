package operatii;

import java.util.Scanner;

public class OperatiiCalcul {

	public static void main(String[] args) {

		// exemplul 1 de adunare - exemplu 1 cu variabile declarate
		int number1 = 11;
		int number2 = 24;
		int sum = number1 + number2;
		int prod = number1 * number2;
		System.out.println(sum);
		System.out.println(prod);

		// exemplul 2 cu variabile declarate
		int number3 = 21;
		int number4 = 44;
		System.out.println(number3 + number4);
		System.out.println(number3*number4);

		// alte exemple
		// diferenta a doua numere de mai sus
		int diferenta = number1 - number2;
		int suma = number1 + number2;
		System.out.println(diferenta);
		System.out.println(suma);
		// produsul a doua numere  de mai sus
		int produs = number1 * number2;
		int cat = number1 / number2;
		System.out.println(produs);
		System.out.println(cat);
		// raportul a doua numare de mai sus
		int raport = number2 / number1;
		System.out.println(raport);

		
		
		
		//operatiuni cu numere cu virgula
		Scanner introducere = new Scanner(System.in);
		float a, b, sumab, prodb;
		System.out.println("Introduceti numarul a: ");
		a = introducere.nextFloat();
		System.out.println("Introduceti numarul b: ");
		b = introducere.nextFloat();
		sumab = a + b;
		prodb = a * b;
		System.out.println(sumab);
		System.out.println(prodb);
		

	}

}
