package testing;

public class StaticExample1 extends AbstractExample {

	
	static String name="Sekhar";
	String fname ="Chandra";
	
	public static void testmethod()
	{
         System.out.println(" I am inside the static method");
	}
	
	public void getData()
	{
		System.out.println(" I am in getdata() Method");
	}

	@Override
	public void writeData() {
		System.out.println(" Generated from Abstract Class");
	}
	
	
	
	
}
