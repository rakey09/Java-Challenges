import java.util.*;

public class FibonacciNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.println("------------Fibonacci Number ----------");
		System.out.println("Enter the any Number :");
		int n = s.nextInt();
		int a=0,b=1,c;
		if(n==0) {
			System.out.println(a);
		}
		for(int i=2;i<=n;i++) {
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(b);

	}

}
