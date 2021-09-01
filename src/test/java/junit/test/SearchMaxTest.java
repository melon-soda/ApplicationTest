package junit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.green.biz.CalcUtil;

public class SearchMaxTest {

	@SuppressWarnings("static-access")
	@Test
	public void testSearchMax() {
		CalcUtil calc = new CalcUtil();
		
		assertEquals("CalcUtil SearchMax Test 1", 4, calc.searchMax(new int[] {1, 3, 4, 2}));
		assertEquals("CalcUtil SerachMax Test 2", -1, calc.searchMax(new int[] {-12, -1, -3, -4, -2}));
	}
}
