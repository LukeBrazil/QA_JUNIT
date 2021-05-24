package operators;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.qa.exampleJunit.calculator.BlackJack;
import com.qa.exampleJunit.calculator.Calculator;
public class CalculatorTest {
	
	@Test
	public void addTest() {
		// Calculator
		double addResult = Calculator.add(3, 4);
		double minusResult = Calculator.subtract(11, 4);
		double divideResult = Calculator.divide(10, 2);
		double multiplyResult = Calculator.multiply(3, 4);
		
		//	Assertions
		// fail();
		// assertTrue | assertFalse
		// assertEquals | assertNotEquals
		
		Assertions.assertEquals(7, addResult);
		Assertions.assertEquals(7, minusResult);
		Assertions.assertEquals(5, divideResult);
		Assertions.assertEquals(12, multiplyResult);
		
		// Blackjack
		int playerBust = BlackJack.play(18, 22);
		Assertions.assertEquals(18, playerBust);
		int dealerBust = BlackJack.play(23, 20);
		Assertions.assertEquals(20, dealerBust);
		int dealerPlayerBust = BlackJack.play(23, 23);
		Assertions.assertEquals(0, dealerPlayerBust);
		
		
	}
}
