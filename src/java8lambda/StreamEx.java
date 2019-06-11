package java8lambda;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx {


	
	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
		//1. Integer Stream
			//IntStream.range(1,10)	
			//.forEach(System.out::println);
		
		//2. Integer Stream with skip
		/*IntStream
		.range(1,10).skip(5)	
		.forEach(x->System.out.println(x));*/
		
		//3. Integer stream with sum
		/*System.out.println(
				IntStream.range(1,5).sum());*/
		
		//4. Stream.of,sorted,findFirst
		//Stream.of("Aman","Akhil","Ankit").sorted().findFirst().ifPresent(System.out::println);
		
		
		//5.Stream of array,sort,filter and print
		
	    //String[] names= {"Aman","Akhil","Ankit","Raghav","Rahul"};
		//Arrays.stream(names).filter(x->x.startsWith("A")).sorted().map(String::toUpperCase).forEach(System.out::println);
		
	    //6. average of squares of int array
		//int[] array= {1,2,3,4,5,6,7,8,9,10};
    	//	Arrays.stream(array).map(x->x*x).average().ifPresent(System.out::println);
		
	    //7. Stream from list,filter and print
		
		//List<String> names=Arrays.asList("Aman","Akhil","Ankit","Raghav","Rahul");
		//names.stream().filter(x-> x.startsWith("A")).sorted().map(String::toLowerCase).forEach(System.out::println);
		
		// 8. Stream rows from text file, sort, filter, and print
		
		//Stream<String> bands=Files.lines(Paths.get("/home/axelor/bands.txt"));
		//bands.sorted().filter(x->x.length()>13).forEach(System.out::println);
		
		//9. Stream rows from text file and save to List
	//List<String> bands=Files.lines(Paths.get("/home/axelor/bands.txt")).filter(x->x.contains("jit")).collect(Collectors.toList());
	//bands.forEach(System.out::println);
		
		// 13. Reduction - sum
				double total = Stream.of(7.3, 1.5, 4.8)
					.reduce(0.0, (Double a, Double b) -> a + b);
				System.out.println("Total = " + total);
		
		
		
	}
}
