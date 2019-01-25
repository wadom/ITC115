public class Assignment3 {

	public static void main(String[] args) {
		
		printPowersOfN(2, 7); 
		System.out.println(); 
		printPowersOfN(5, 3);

	}

	public static void printPowersOfN(int base, int exponent) {
		
		for (int i = 0; i <= exponent; i++) {
			int equation = (int) Math.pow(base, i);
			System.out.print(equation + " ");
		}

	}

}
