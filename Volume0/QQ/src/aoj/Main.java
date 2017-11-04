package aoj;

public class Main {
	/**
	 * 九九を出力する
	 *
	 * @param args
	 *            使用しない
	 */
	public static void main(String[] args) {
		for (int first = 1; first < 10; first++) {
			for (int second = 1; second < 10; second++) {
				System.out.println(first + "x" + second + "=" + (first * second));
			}
		}

	}
}
