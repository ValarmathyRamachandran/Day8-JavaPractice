public class ComparisonUC3 {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");


 		Integer x1 = new Integer(1);
		Integer x2 = new Integer(4);
		Integer y1 = new Integer(1);
		Integer y2 = new Integer(4);

	  	System.out.println(x1.compareTo(y1));// Both are equal
		System.out.println(x1.compareTo(x2)); //x1 is less than x2
		System.out.println(x2.compareTo(y1)); // x2 is greater than y1

	}
}



