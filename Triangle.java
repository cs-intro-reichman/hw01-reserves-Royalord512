/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		int min = Math.min(a, Math.min(b, c));
		int middle = Math.min(Math.max(a, b), 
					 Math.max(Math.min(a, b), c));
		int max = Math.max(a, Math.max(b, c));

		boolean triangle = min + middle > max;

		System.out.println(min + ", " + middle + ", " +	
						   max + ": " + triangle);

	}
}
