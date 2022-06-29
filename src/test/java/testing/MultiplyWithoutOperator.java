package testing;

public class MultiplyWithoutOperator {

	public static int multipleNos(int a, int b) {

		int mul = 0;

		for (int i = 1; i <= b; i++) {
			mul = a + mul;
		}

		return mul;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = multipleNos(10, 20);
		System.out.println(result);

	}

}
