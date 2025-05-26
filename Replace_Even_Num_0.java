package Arrays2D;

import java.util.Scanner;

public class Replace_Even_Num_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements:\n");
		int arr[][] = new int[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		System.out.print("\nThe input for the array elements:\n");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.print("\nthe output array elements:\n");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if ((arr[i][j]) % 2 == 0) {
					arr[i][j] = 0;
				}
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		sc.close();
	}
}

//Eg: if your input is,
//2  4  9  0
//7  2  1  1
//1  5  8  3
//6  8  0  9
//The output should be,
//0  0  9  0
//7  0  1  1
//1  5  0  3
//0  0  0  9