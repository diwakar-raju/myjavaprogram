package Data;

import java.util.ArrayList;
import java.util.List;

public class StreamMain {
	static List<String> places=new ArrayList<>();
	
	public static List getPlaces()
	{
		places.add("Nepal, Kathmandu");
		places.add("India, Delhi");
		places.add("Tamil nadu, Chennai");
		return places;
		
	}
	public static void main(String[] args) {
		List<String> myPlace=getPlaces();
		System.out.println("Places from Tamil Nadu,India: ");
		myPlace.stream()
		.filter(e-> e.startsWith("Tamil nadu"))
		.map(e->e.toUpperCase())
		.sorted()
		.forEach(e->System.out.println(e));
		
		
	}
}
