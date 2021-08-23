
	import java.util.*;
	public class QuotientandRemainder {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);	
	int dividend;
	int divisor;
	int quotient;
	int remainder;
	System.out.println("Enter the dividend");
	dividend = s.nextInt();
	System.out.println("Enter the divisor");
	divisor = s.nextInt();
	quotient = dividend / divisor;
	remainder = dividend % divisor;
	System.out.println("quotient = "+quotient + ";" + "remainder = "+remainder);
	}
	}

}
