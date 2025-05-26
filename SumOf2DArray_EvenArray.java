package Arrays2D;

import java.util.Scanner;

public class SumOf2DArray_EvenArray {
// Offline Assignment - 2D Array Processing
// create a 4X4 array -- Replace the values as 0 whose sum of indexes is even.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Elements of 4x4 Matrix: ");
		int arr[][] = new int[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] = sc.nextInt();
			}
			System.out.println("\t");
		}
		System.out.println("\nThe input Array elements matrix is: \n");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.print("\nThe array elements whose sum of indices are even: \n");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if((i+j)%2==0) {
					arr[i][j] =0;
				}
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		sc.close();
	}
}


//If your input is,
//2  4  9  0
//7  2  1  1
//1  5  8  3
//6  8  0  9
//The output should be,
//0  4  0  0
//7  0  1  0
//0  5  0  3
//6  0  0  0
