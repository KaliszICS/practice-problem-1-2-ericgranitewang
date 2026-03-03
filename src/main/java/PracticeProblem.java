public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static boolean validIndex(int[] a, int b) {
		try {
			return a[b] >= Integer.MIN_VALUE;
		} catch (IndexOutOfBoundsException e) {
			return false;
		}
	}

	public static int divide (int a, int b) {
		try {
			return a/b;
		} catch (ArithmeticException e) {
			return 0;
		}
	}

	public static int safeConvertStringtoInt(String a) {
		try {
			return Integer.parseInt(a);
		} catch (NumberFormatException e) {
			return 0;
		}
	}

}
