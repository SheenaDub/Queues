
public class PCQ7L {

	
	public static void main(String[] args) {
		LinkedDeque<String> a = new LinkedDeque<String>();
		
		
		a.insertFirst("Ireland");
		System.out.println("After 'insert first Ireland'");
		System.out.println(a);
		System.out.println();
		a.removeLast();
		System.out.println("After 'Remove last'");
		System.out.println(a);
		System.out.println();
		
		System.out.println();
		a.insertLast("England");
		System.out.println("After 'insertLast england'");
		System.out.println(a);
	
		
		System.out.println();
		a.removeFirst();
		System.out.println("After 'remove first'");
		System.out.println(a);
		
		
		System.out.println();
		System.out.println("After 'insertLast wales'");
		a.insertLast("Wales");
		System.out.println(a);
	
		
		System.out.println();
		a.insertFirst("Scotland");
		System.out.println("After 'insert first scotland'");
		System.out.println(a);
		
		
		System.out.println();
		System.out.println("After 'insertLast France':");
		a.insertLast("France");
		System.out.println(a);
		System.out.println();
		
		System.out.println("After 'remove first':");
		a.removeFirst();
		System.out.println(a);
		System.out.println();
		
		System.out.println("After 'remove last':");
		a.removeLast();
		System.out.println(a);
		System.out.println();
		
		

		System.out.println();
		System.out.println("After 'insertLast Germany':");
		a.insertLast("Germany");
		System.out.println(a);
		
	
	}// end main
	
	
	
} // end class
