package aoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	/**
	 * 三角形の頂点を入力すると、三角形の外接円の中心と半径を求める
	 *
	 * @param args
	 *            使用しない
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int lineNum = Integer.parseInt(br.readLine());
			for (int i = 0; i < lineNum; i++) {
				String line = br.readLine();
				String[] temp = line.split(" ");
				float x1 = Float.parseFloat(temp[0]);
				float y1 = Float.parseFloat(temp[1]);
				float x2 = Float.parseFloat(temp[2]);
				float y2 = Float.parseFloat(temp[3]);
				float x3 = Float.parseFloat(temp[4]);
				float y3 = Float.parseFloat(temp[5]);
				Circle circle = new Circle(x1, y1, x2, y2, x3, y3);
				System.out.printf("%.3f %.3f %.3f\n", circle.getCenterX(), circle.getCenterY(), circle.getRadius());
			}
		}
	}

	public static class Circle {
		private float centerX;
		private float centerY;
		private float radius;

		/**
		 * 指定した3つの座標を通る円を生成する
		 *
		 * @param x1
		 *            座標1のx座標
		 * @param y1
		 *            座標1のy座標
		 * @param x2
		 *            座標2のx座標
		 * @param y2
		 *            座標2のy座標
		 * @param x3
		 *            座標3のx座標
		 * @param y3
		 *            座標3のy座標
		 */
		public Circle(float x1, float y1, float x2, float y2, float x3, float y3) {

			/**
			 * 計算を容易にするために(x1, y1)を原点とした座標系に変換する
			 */
			x2 = x2 - x1;
			y2 = y2 - y1;

			x3 = x3 - x1;
			y3 = y3 - y1;

			/**
			 * X^2 + Y^2 - 2mX - 2nY + l = 0 を解いて、中心と半径を求める
			 */
			centerX = ((x3 * x3 + y3 * y3) * y2 - (x2 * x2 + y2 * y2) * y3) / (2.0f * (x3 * y2 - x2 * y3));
			centerY = ((x3 * x3 + y3 * y3) * x2 - (x2 * x2 + y2 * y2) * x3) / (2.0f * (y3 * x2 - y2 * x3));

			radius = (float) Math.sqrt(centerX * centerX + centerY * centerY);

			/**
			 * 元の座標系に変換する
			 */
			centerX += x1;
			centerY += y1;
		}

		/**
		 * 中心のx座標を取得する
		 *
		 * @return x座標
		 */
		public float getCenterX() {
			return centerX;
		}

		/**
		 * 中心のy座標を取得する
		 *
		 * @return y座標
		 */
		public float getCenterY() {
			return centerY;
		}

		/**
		 * 半径を取得する
		 *
		 * @return 半径
		 */
		public float getRadius() {
			return radius;
		}
	}

}
