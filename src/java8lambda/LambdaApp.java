package java8lambda;


@FunctionalInterface
interface Cab{
	void bookCab();//no param
	
	//void bookCab(String Source,String Destination);//With param
//	double bookCab(String Source,String Destination);//with return type
}
//Way 1
/*class UberX implements Cab{
	
	@Override
	public void bookCab() {
		// TODO Auto-generated method stub
	System.out.println("Cab Booked!!");	
	}
}*/






public class LambdaApp {
	static int staticVar=10;
	 int instanceVar=20;

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		//1. way
		//Cab cab=new UberX();//POLYMORPHIC STATEMENT
	    //cab.bookCab();
		
		//2.Way--anonymous class implementation
	/*	Cab cab=new Cab() {
			
			@Override
			public void bookCab() {
				// TODO Auto-generated method stub
				System.out.println("Cab Booked!!");
			}
		};
		cab.bookCab();*/

		/*Cab cab= (Source,Destination)->{
			System.out.println("Cab Booked from "+Source+" to "+Destination);
	
			return 950.12;
		};
		//double fare =cab.bookCab("VR","Dumas");
	
		//System.out.println("Fare shall be "+fare);
		*/
		Cab cab = ()->{
			int localvar=30;
			System.out.println("Cab Booked");
			System.out.println("Static VAriable="+staticVar);
			System.out.println("Local VAriable="+localvar);
		//	System.out.println("Instance VAriable="+this.instanceVar);
		};
		cab.bookCab();
		
		
}
	
	
}
