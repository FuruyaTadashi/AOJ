package aoj;

import java.util.Scanner;

public class Main {

	/**
	 * メイン関数ｰ
	 *
	 * @param args
	 *            使用しない
	 */
	public static void main(String[] args) {
		Rectangle rectangle = null;
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			rectangle = new Rectangle(a, b);
		}
		System.out.println(rectangle.getArea() + " " + rectangle.getEdgeLength());
	}

	public static class Rectangle {
		private final int a;
		private final int b;

		public Rectangle(int a, int b) {
			this.a = a;
			this.b = b;
		}

		/**
		 * 面積を取得する
		 *
		 * @return 面積
		 */
		public int getArea() {
			return a * b;
		}

		/**
		 * 周の長さを取得する
		 *
		 * @return 周の長さ
		 */
		public int getEdgeLength() {
			return (a + b) * 2;
		}

	}

}
