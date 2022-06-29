package testing;

public class MethodAcceptingArray {

	public static int somOfArray(int[] b) {
		int sum = 0;

		for (int i = 0; i < b.length; i++) {
			sum = sum + b[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2, 3, 4 };

		int result = somOfArray(a);
		System.out.println(result);

	}



}

