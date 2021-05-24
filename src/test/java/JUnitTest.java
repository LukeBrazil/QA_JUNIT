import com.qa.exampleJunit.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
@SuppressWarnings("unused")
public class JUnitTest {
	
	@BeforeAll
	public static void startTest() {
		System.out.println("Starting Test...");
	}
	
	@Test
	public void test1() {
		System.out.println("Hello World");
	}
	
	@AfterAll
	public static void endTest() {
		System.out.println("Ending Test...");
	}
}
