
public class Assignment1 {

	public boolean isaPalindrome(String expr) {

		if (expr == null || expr.length() <= 1) {
			return true;
		} else if (expr.charAt(0) != expr.charAt(expr.length() - 1)) {
			return false;
		} else {
			return isaPalindrome(expr.substring(1, expr.length() - 1));
		}

	}

	public int find() {
		Assignment1 a = new Assignment1();
		int product;
		String s;

		for (int x = 9999; x > 0; x--) {// starts both numbers at the highest they can be
			for (int y = 9999; y > 0; y--) {
				product = x * y;
				s = "" + product;

				if (a.isaPalindrome(s)) {// if the number is a palindrome, return it
					return product;
				}

			}
		}
		return 0;
	}

	public static void main(String args[]) {
		Assignment1 a = new Assignment1();
		System.out.println("The largest palindromic number made from");
		System.out.println("the product of two 4-digit numbers is:");
		System.out.println(a.find());

	}

}
