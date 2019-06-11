package java8lambda;

import java.util.*;

public class Foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list=new ArrayList<String>();
		list.add("Apple");
		list.add("Mango");
		list.forEach((n)->System.out.println(n));  
		
		
		

	}

}
