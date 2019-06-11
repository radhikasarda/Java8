package java8lambda;

interface Phone{
	
	
	void call();
	default void message() {
		System.out.println("Message sent");
		
	};
	
}






public class DefaultMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Phone ph=()->System.out.println("Calling");
		ph.call();
		ph.message();
		

	}

}
