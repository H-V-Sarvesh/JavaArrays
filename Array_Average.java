package Arrays;

import java.util.Scanner;

public class Array_Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int numbers[] = new int[100];
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter number " + (i + 1) + ": ");
			numbers[i] = scanner.nextInt();
			sum += numbers[i];
		}
		double average = sum / 5.0;
		System.out.println("Average of the 5 numbers: " + average);
		scanner.close();

	}

}
