package aoj;

import java.util.Scanner;

public class Main {

	/**
	 * メイン関数
	 *
	 * @param args
	 *            使用しない
	 */
	public static void main(String[] args) {
		int num = 0;
		try (Scanner sc = new Scanner(System.in)) {
			num = sc.nextInt();
		}
		System.out.println(calcCubic(num));
	}

	/**
	 * 入力値を3乗する
	 *
	 * @param num
	 *            入力値
	 * @return 計算結果
	 */
	private static int calcCubic(int num) {
		return (int) Math.pow(num, 3);
	}

}
