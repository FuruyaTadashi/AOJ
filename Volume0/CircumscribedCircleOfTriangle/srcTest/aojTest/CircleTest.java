package aojTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import aoj.Main.Circle;

@RunWith(Enclosed.class)
public class CircleTest {

	public static class ＡＯＪサンプル試験 {
		@Test
		public void 直角二等辺三角形の外接円() {
			Circle circle = new Circle(0.0f, 0.0f, 2.0f, 0.0f, 2.0f, 2.0f);
			/**
			 * floatは指定された精度の文字列に変換してから比較
			 */
			assertEquals("1.000", String.format("%.3f", circle.getCenterX()));
			assertEquals("1.000", String.format("%.3f", circle.getCenterY()));
			assertEquals("1.414", String.format("%.3f", circle.getRadius()));
		}
	}
}
