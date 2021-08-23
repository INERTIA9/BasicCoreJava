
	import java.util.Scanner;
	public class VowelConsonant {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the alphabaet");
	char alphabaet;
	char ch= s.next().charAt(0);
	if(ch=='a' || ch=='e' || ch=='i' || ch=='o'| ch=='u') {
	System.out.println("Entered alphabaet is vowel");
	}
	else {
	System.out.println("Entered alphabaet is consonant");
	}
	}
	}

