import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

public class TestSuite implements TestLifecycle {
	@Test
	public void test__1() {
		assertEquals(1, 1);
	}

	@Test
	public void test__2() {
		assertEquals(1, 1);
	}

	@Test
	public void test__3() {
		assertEquals(1, 1);
	}
}
