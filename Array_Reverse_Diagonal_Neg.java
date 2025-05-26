package Arrays2D;

import java.util.Scanner;

public class Array_Reverse_Diagonal_Neg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[4][4];
		System.out.println("enter 4 elements row and column: ");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		System.out.print("\nThe input Array elements matrix is: \n");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.print("\nThe array elements of diagonal matrix: \n");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if ((i + j) == 3) {
					arr[i][j] = -1;
				}
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
			sc.close();
		}
	}
}

//Eg:  if your input is,
//2  4  9  0
//7  2  1  1
//1  5  8  3
//6  8  0  9
//The output should be,
//2   4   9  -1
//7   2  -1   1
//1  -1   8   3
//-1   8   0   9
