
	import java.util.*;
	public class LargestNumber {
	public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("Enter three numbers : num1;num2;num3");
	double num1 = s.nextDouble();
	double num2 = s.nextDouble();
	double num3 = s.nextDouble();
	if(num1>num2 && num1>num3) {
	System.out.println(+num1 +" "+"is greatest");
	}
	else if(num2>num1 && num2>num3) {
	System.out.println(+num2 +" "+ "is greatest");
	}
	else {
	System.out.println(+num3 +" "+ "is geatest");
	}
	}
	}


