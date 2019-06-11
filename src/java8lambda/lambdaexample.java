package java8lambda;


@FunctionalInterface
interface Activity{
	void play();
	
}

/*class Children implements Activity{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Start playing");
	}
	
	
	
	
}*/

public class lambdaexample {

	
public static void main(String[] args)	{
	
	
			//1.
          	//Activity activity=new Children();//Polymorphic statement
          	//activity.play();
          	
	
			//2.
			/*Activity activity=new Activity() {
				
				@Override
				public void play() {
					// TODO Auto-generated method stub
					System.out.println("Start playing");
					
				}
			};
			activity.play();*/
            
			 Activity activity=()->{
				 
				 System.out.println("Start playing");
			 };
			  activity.play();


}


	
	
}
