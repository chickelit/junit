import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.*;

public class TestSuite {
	@Test
	public void test__1() {
		assertEquals(1, 1);
	}

	@Test
	@Timeout(value = 5, unit = TimeUnit.MILLISECONDS)
	public void test__2() {
		assertEquals(1, 1);
	}

	@Test
	public void test__3() {
		assertEquals(1, 1);
	}
}
