package testing;

public class TypeCastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParentExample p = new ChildExample();  // Upcasting 
		p.startDev();
		ChildExample c = (ChildExample) p;  // DownCasting
		c.startDev();

		
	     String str ="chandra,sekhar,raparla";
	     String[] str1=str.split(",");
	     System.out.println(str1[1]);
	}

}
