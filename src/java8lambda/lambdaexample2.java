package java8lambda;

@FunctionalInterface
interface Addable{
	
	int add(int a1,int a2);
}


public class lambdaexample2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addable add1=(a1,a2)->(a1+a2);
		//System.out.println("Sum="+add1.toString());
		System.out.println(add1.add(10,20));

	}
	

}
