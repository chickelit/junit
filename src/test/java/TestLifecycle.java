import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public interface TestLifecycle {
	@BeforeAll
	default void beforeAll() {
		System.out.println("Default beforeAll");
	}

	@BeforeAll
	default void afterAll() {
		System.out.println("Default afterAll");
	}

	@BeforeAll
	default void beforeEach() {
		System.out.println("Default beforeEach");
	}

	@BeforeAll
	default void afterEach() {
		System.out.println("Default afterEach");
	}
}
