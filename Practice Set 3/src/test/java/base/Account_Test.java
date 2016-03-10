package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * 
 * @author Hayley Andrews
 *
 */
public class Account_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Tests methods and prints balance, monthly interest, and 
	 * @throws InsufficientFundsException
	 */
	@Test
	public void testMethods() throws InsufficientFundsException {
		Account test = new Account(1122, 20000);
		test.setAnnualInterestRate(4.5);

		assertEquals(.375, test.getMonthlyInterestRate(), .00001);
		

		test.withdraw(2500);
		test.deposit(3000);

		System.out.println("Balance is $" + test.getBalance() + "\n" + "Monthly Interest is %"
				+ test.getMonthlyInterestRate() + "\n" + "Account Created " + test.getDateCreated());

	}
/**
 * Tests exception
 * @throws InsufficientFundsException
 */
	@Test
	public void testexception() throws InsufficientFundsException {
		Account test = new Account(1122, 20000);
		test.setAnnualInterestRate(.045);
		try {
			test.withdraw(20100);
			fail("Throw exception if withdraw more than balance");
		} catch (InsufficientFundsException testing) {
			System.out.println("Withdraw too large, short $" + testing.getAmount());
			}
	}

}
