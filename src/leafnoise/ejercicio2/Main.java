package leafnoise.ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Integer principalDiagonal = 0, secondaryDiagonal = 0, rows = 0, columns = 0;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Insert the amount of rows of the matrix");
		rows = keyboard.nextInt();
		System.out.println("\n" + "Insert the amount of columns of the matrix");
		columns = keyboard.nextInt();

		Integer matriz[][] = new Integer[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.println("Insert a number");
				matriz[i][j] = keyboard.nextInt();
			}
		}
		System.out.println(toString(matriz, rows, columns));
		principalDiagonal = sumPrinDiagon(matriz, rows, columns);

		System.out.println("\n" + "The sum of the principal diagonal is: " + principalDiagonal);
		secondaryDiagonal = sumSecDiago(matriz, rows, columns);

		System.out.println("The sum of the secondary diagonal is: " + secondaryDiagonal);
		System.out.println(
				"\n" + "The difference between both is: " + difference(principalDiagonal, secondaryDiagonal));
	}

	public static String toString(Integer[][] matrix, Integer rows, Integer columns) {
		String array = "";
		for (int i = 0; i < rows; i++) {
			array += "|";
			for (int j = 0; j < matrix[i].length; j++) {
				array += matrix[i][j] + ", ";
			}
			array += "|\n";
		}
		return array;
	}

	public static Integer sumPrinDiagon(Integer[][] matrix, Integer rows, Integer columns) {
		Integer sumPrin = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (i == j) {
					sumPrin += matrix[i][j];
				}

			}
		}
		return sumPrin;
	}

	public static Integer sumSecDiago(Integer[][] matrix, Integer rows, Integer columns) {
		Integer sumSec = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if ((i + j) == rows - 1) {
					sumSec += matrix[i][j];
				}
			}
		}
		return sumSec;
	}

	public static Integer difference(Integer principalDiagonal, Integer secondaryDiagonal) {
		return principalDiagonal - secondaryDiagonal;
	}
}
