
public class Assignment2 {

	public long findSum(long x, long y) {
		long sum = 0;
		if (x % 2 != 0) {// if x is odd, add it (don't need to add y because it becomes x next round)
			sum += x;
		}

		if (y >= 2000000000000.0) {// base case: a number reaches 2 billion
			return sum;
		} else {

			return sum + findSum(y, x + y); // return the sum plus the rest of the odds
		}

	}

	public static void main(String args[]) {
		Assignment2 a = new Assignment2();

		System.out.println("The sum of the odd numbers less than 2 billion");
		System.out.println("in the Fibonacci Sequence is:");
		System.out.println(a.findSum(0, 1));

	}

}
