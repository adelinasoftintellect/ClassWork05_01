
public class Main {
	public static void printArray(int[] b) {
		for (int i = b.length - 1; i >= 0; i--) {
			System.out.print(b[i] + " ");

		}
	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };
		printArray(a);

	}

}
