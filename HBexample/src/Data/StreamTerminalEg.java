package Data;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamTerminalEg {
	public static void main(String[] args) {
		
	
	List<String> names=Arrays.asList(
			"Reflection","Collection","Stream","Structure","Sorting","State"
			);
	System.out.println("forEach:");
	names.stream().forEach(System.out::println);
	
	String cancatenatedNames=names.stream().reduce(
			"",
			(partialString, element)->partialString+" "+element);
			System.out.println("nreduce (concatenated names):");
			System.out.println(cancatenatedNames.trim());
			
			long count = names.stream().count();
			System.out.println("\ncount:"+count);
			
			Optional<String> firstName=names.stream().findFirst();
			System.out.println("\nfirstFind");
			
			firstName.ifPresent(System.out::println);
			
			boolean allstartswiths=names.stream().allMatch(
					name->name.startsWith("S"));
			System.out.println("\nallMatch (all start with 'S'):");
			System.out.println(allstartswiths);
			
			boolean anystartswith = names.stream().anyMatch(name->name.startsWith("S"));
			System.out.println("\nanyMatch(any start with 'S'):");
			System.out.println(anystartswith);
					
				
}
}
