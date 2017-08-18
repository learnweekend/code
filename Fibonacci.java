package practice;

public class Fibonacci {
	
	public static int fibonacciR(int n){
		if(n == 0 || n == 1)
			return n;
		return fibonacciR(n - 1) + fibonacciR(n - 2);
	}
	
	public static int fibonacciI(int n){
		int[] cache = new int[n + 1];
		cache[0] = 0;
		cache[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			cache[i] = cache[i - 1] + cache[i - 2];
		}
		return cache[n];
	}

	
	public static void main(String[] args) {
		System.out.println("8th Fibonacci number = " +fibonacciR(8));
		System.out.println("8th Fibonacci number = " +fibonacciI(8));
	}
	
}
