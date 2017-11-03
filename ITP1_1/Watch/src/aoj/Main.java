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
		Watch watch = null;
		try (Scanner sc = new Scanner(System.in)) {
			int initialValue = sc.nextInt();
			watch = new Watch(initialValue);
		}
		System.out.println(watch.getHour() + ":" + watch.getMinite() + ":" + watch.getSecond());
	}

	public static class Watch {
		private int hour;
		private int minite;
		private int second;

		/**
		 * 初期値を時分秒に分解して保持する。 24時を超えると0時に戻る。
		 *
		 * @param initialValue
		 */
		public Watch(int initialValue) {
			int work = initialValue;

			this.second = work % 60;
			work = work / 60;
			this.minite = work % 60;
			work = work / 60;
			this.hour = work % 24;
		}

		/**
		 * 時間を取得する
		 *
		 * @return 時間
		 */
		public int getHour() {
			return hour;
		}

		/**
		 * 分を取得する
		 *
		 * @return 分
		 */
		public int getMinite() {
			return minite;
		}

		/**
		 * 秒を取得する
		 *
		 * @return 秒
		 */
		public int getSecond() {
			return second;
		}

	}

}
