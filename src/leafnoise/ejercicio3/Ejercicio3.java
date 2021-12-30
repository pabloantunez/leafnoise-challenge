package leafnoise.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Integer height = 0;
		String pyramidOfAsterisks = "";

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Insert the height of the pyramid: ");
		height = keyboard.nextInt();
		drawPyramid(height);

	}

	private static void drawPyramid(Integer height) {
		for (int i = 1; i <= height; i++) {
			for (int spaces = 1; spaces <= (height - i); spaces++) {
				System.out.print(" ");
			}
			for (int asterisks = 1; asterisks <= (i + 1) - 1; asterisks++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
