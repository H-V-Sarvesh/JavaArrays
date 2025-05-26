package Arrays2D;

import java.util.Scanner;

public class LargestNum_2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input elements of the array: ");
		int arr[][] = new int[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("The Output matrix is: ");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("\nThe Output matrix of largest number is: ");
		for (int i = 0; i < 4;) {
			for (int j = 0; j < 4; j++) {
				System.out.println("\nThe largest number in row" + " " + (i + 1) + ":");
				if (arr[i][j] > arr[i][j]) {
					System.out.println(arr[i][j]);
					i++;
				} else {
					System.out.println(arr[i][j]);
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
