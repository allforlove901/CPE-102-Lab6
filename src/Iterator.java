import java.util.ArrayList;
import java.util.ListIterator;

public class Iterator {
	
	public static void main(String[] args){
		
		ArrayList<String> names = new ArrayList<String>();

		names.add("Brett");
		names.add("Alex");
		names.add("Stephen");
		names.add("Connor");
		names.add("Todd");
		
		ListIterator<String> iterator = names.listIterator();

		while(iterator.hasNext()){
			System.out.println(iterator.next());
			if (iterator.hasNext())
				iterator.next();}
		
		System.out.println();
		
		while(iterator.hasPrevious())
			System.out.println(iterator.previous());
	}
}
