package Arrays2D;

public class Array_Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 1, 2, 3 } };
		System.out.println("\nThe given Matrix: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				/*
				 * if ((i + j) % 2 != 0) { arr[i][j] = 0; System.out.print(arr[i][j]); } else {
				 * System.out.print(arr[i][j]); }
				 */
				System.out.print(arr[i][j]);
}
			System.out.println();
		}
		System.out.println("\nThe Transposed Matrix: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				/*
				 * if ((i + j) % 2 != 0) { arr[i][j] = 0; System.out.print(arr[i][j]); } else {
				 * System.out.print(arr[i][j]); }
				 */
				System.out.print(arr[j][i]);
}
			System.out.println();
		}
	}

}
