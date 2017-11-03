package aojTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import aoj.Main.Rectangle;

@RunWith(Enclosed.class)
public class RectangleTest {

	public static class ＡＯＪサンプル試験 {
		@Test
		public void 面積を求める() {
			Rectangle rectangle = new Rectangle(3, 5);
			assertEquals(15, rectangle.getArea());
		}

		@Test
		public void 周の長さを求める() {
			Rectangle rectangle = new Rectangle(3, 5);
			assertEquals(16, rectangle.getEdgeLength());
		}
	}

	public static class 最小値試験 {
		@Test
		public void 面積を求める() {
			Rectangle rectangle = new Rectangle(1, 1);
			assertEquals(1, rectangle.getArea());
		}

		@Test
		public void 周の長さを求める() {
			Rectangle rectangle = new Rectangle(1, 1);
			assertEquals(4, rectangle.getEdgeLength());
		}
	}

	public static class 最大値試験 {
		@Test
		public void 面積を求める() {
			Rectangle rectangle = new Rectangle(100, 100);
			assertEquals(10000, rectangle.getArea());
		}

		@Test
		public void 周の長さを求める() {
			Rectangle rectangle = new Rectangle(100, 100);
			assertEquals(400, rectangle.getEdgeLength());
		}
	}
}