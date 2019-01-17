
public class Fibonacci {

	public static void main(String[] args) {
		
		int fibonacci1 = 0;
		int fibonacci2 = 1;
		System.out.println(fibonacci2);
		
		for (int i = 1; i < 12; i++) {
			int fibonacci = fibonacci1 + fibonacci2;
			System.out.println(fibonacci);
			fibonacci1 = fibonacci2;
			fibonacci2 = fibonacci;
			
		}

	}

}
