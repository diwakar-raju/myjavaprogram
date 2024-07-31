package Data;

import java.util.Arrays;
import java.util.List;

public class LambdaExample {

	public static void main(String[] args) {
		List<String> li=Arrays.asList("Tanjore","Karur","Chennai","Salem","Coimbatore","Trichy","Kaniyakumari");
		
		//li.forEach(s->System.out.println(s));
		//li.forEach(System.out::println);
		System.out.println("City Starts with 'C':");
		li.stream()
		.filter(e-> e.startsWith("C"))
		.sorted()
		.map(e->e.toUpperCase())
		.forEach(e->System.out.println(e));
		System.out.println("************");
		System.out.println("City Starts with 'T':");
		li.stream()
		.filter(e-> e.startsWith("T"))
		.sorted()
		.map(e->e.toUpperCase())
		.forEach(e->System.out.println(e));

	}
}
