package testing;

public class StaticExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(StaticExample1.name);
		StaticExample1.testmethod();
		
		StaticExample1 se1 = new StaticExample1();
		System.out.println(se1.fname);
		se1.getData();
		System.out.println(se1.name);
		se1.testmethod();
		
        se1.getData1();
	}

}
