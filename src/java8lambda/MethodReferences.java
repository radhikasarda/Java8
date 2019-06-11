package java8lambda;

interface Calculator{
	 
	 void add(int num1,int num2);

}


class Calci {

	public static void addSomething(int num1,int num2) {
		System.out.println(num1+"+"+num2+" "+"="+(num1+num2));
		
	}
	public void letsadd(int num1,int num2) {
		
		System.out.println(num1+" & "+num2+" adds to "+(num1+num2));
	}
	
}

interface Messenger{
	
	Message getMessage(String msg);
	
}
class Message{
	 Message(String msg){
		
		System.out.println("Message is "+msg);
	 }
	
	
	
	
}

public class MethodReferences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		//	Calci.addSomething(10,20);

		
		//Reference to static method
			
		//Calculator cRef=Calci::addSomething;//Static Method Reference
		//cRef.add(11, 12);
	
	
		//Reference to non static method
	
		//Calci calci=new Calci();
		//Calculator cRef=calci::letsadd;//Non Static Method Reference
		//cRef.add(10, 20);
		
		
		//Reference to a constructor
		Messenger mRef=Message::new;
		mRef.getMessage("Hello");
	
	}
	
	

}
