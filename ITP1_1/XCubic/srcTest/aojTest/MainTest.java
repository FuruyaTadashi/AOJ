package aojTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import aoj.Main;
import mockit.Deencapsulation;

@RunWith(Enclosed.class)
public class MainTest {

	public static class ＡＯＪサンプル試験 {
		@Test
		public void _２の３乗は８() {
			int ans = Deencapsulation.invoke(Main.class, "calcCubic", (int) 2);
			assertEquals(8, ans);
		}

		@Test
		public void _３の３乗は２７() {
			int ans = Deencapsulation.invoke(Main.class, "calcCubic", (int) 2);
			assertEquals(8, ans);
		}

	}

	public static class 最小値最大値試験 {
		@Test
		public void _１の３乗は１() {
			int ans = Deencapsulation.invoke(Main.class, "calcCubic", (int) 1);
			assertEquals(1, ans);
		}

		@Test
		public void _１００の３乗は１００００００() {
			int ans = Deencapsulation.invoke(Main.class, "calcCubic", (int) 100);
			assertEquals(1000000, ans);
		}

	}
}
