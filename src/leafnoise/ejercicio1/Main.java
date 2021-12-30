package leafnoise.ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws CharacterInvalidException {

		String stringOfNumbers;
		Integer result = 0;
		String[] characters;

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please, insert a string of numbers separeted by ','. ");
		stringOfNumbers = keyboard.next();

		Conversion conversion = new Conversion();
		characters = conversion.stringToArray(stringOfNumbers);
		result = conversion.sumOfNumbers(characters);

		System.out.println("The result is: " + result);
	}

}
