package aojTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import aoj.Main.Watch;

@RunWith(Enclosed.class)
public class WatchTest {

	public static class ＡＯＪサンプル試験 {
		@Test
		public void 時間を求める() {
			Watch watch = new Watch(46979);
			assertEquals(13, watch.getHour());
			assertEquals(2, watch.getMinite());
			assertEquals(59, watch.getSecond());
		}
	}

	public static class 最小値試験 {
		@Test
		public void _０時０分０秒() {
			Watch watch = new Watch(0);
			assertEquals(0, watch.getHour());
			assertEquals(0, watch.getMinite());
			assertEquals(0, watch.getSecond());
		}
	}

	public static class 最大値試験 {
		@Test
		public void _２３時５９分５９秒() {
			Watch watch = new Watch(86399);
			assertEquals(23, watch.getHour());
			assertEquals(59, watch.getMinite());
			assertEquals(59, watch.getSecond());
		}
	}

	public static class 境界値試験 {
		@Test
		public void _０時０分０秒() {
			Watch watch = new Watch(0);
			assertEquals(0, watch.getHour());
			assertEquals(0, watch.getMinite());
			assertEquals(0, watch.getSecond());
		}
	}

}