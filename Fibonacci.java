import java.util.HashMap;

public class Fibonacci {

	private static HashMap<Integer, Long> values = new HashMap<Integer, Long>();

	public static long f(int n) {

        if (n <= 2) {
        	return 1;
        }
        if(!values.containsKey(n)) {
        	values.put(n, f(n - 1) + f(n - 2));
		}
		return values.get(n);
    }

	public static void main(String args[]) {
		if(args.length == 0) {
			System.out.println("Usage: java Fibonacci INT");
		} else {
			try {  
    			int n = Integer.valueOf(args[0]);
				System.out.printf("f(%d) = %d%n", n, f(n));
  			} catch(NumberFormatException e) {  
    			System.out.println("Argument 1 must be an integer");
  			}
		}
	}
}