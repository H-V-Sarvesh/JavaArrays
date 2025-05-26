package Arrays;

public class Array_Multiples_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[100];
		for(int i=0; i<array.length; i++) {
			array[i] = i;
			if(array[i]%5==0) {
				System.out.println(array[i]);
			}
		}
	}

}
