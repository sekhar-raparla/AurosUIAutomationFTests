package testing;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Chandra");
		al.add(1, "Sekhar");
		al.add("Raparla");
		
		if(al.contains("Chandra"))
		{
			System.out.println("Pass");
		}
		
		al.remove(0); // Removes the value at first index
		al.remove("Raparla"); // Removes the string 
				
		System.out.println(al);		
	}

}
