
public class Fibonaci {
	public static void main(String[] args) {
		int num = 4;
		int fiboNum = findFibo(num);
		System.out.println(fiboNum);
	}

	public static int findFibo(int num) {

		int[] result = new int[num + 2];
		result[0] = 0;
		result[1] = 1;

		for (int i = 2; i <= num; i++) {
			result[i] = result[i - 1] + result[i - 2];
		}
		return result[num];
	}
}
//O(n);