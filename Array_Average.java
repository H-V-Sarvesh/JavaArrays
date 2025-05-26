package Arrays;

import java.util.Scanner;

public class Array_Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("enter the array elements: "); int sum = 0; int[] arr =
		 * new int[5]; for (int i = 0; i < arr.length; i++) { arr[i] = sc.nextInt();
		 * //sum = arr[i] + arr[i++]; } for (int i = 0; i < arr.length; i++) { while
		 * (arr[i] <= arr[5]) { sum = arr[i]; arr[i]++; } // sum = arr[i] + arr[i+1];
		 * break; } int avg = sum / 5; System.out.println(avg); sc.close();
		 */

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
