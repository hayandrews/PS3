package base;

/**
 * 
 * @author Hayley Andrews
 *
 */
public class InsufficientFundsException extends Exception {

	private double amount;

	/**
	 * To be used when too much money is withdrawn
	 * @param amount
	 */
	public InsufficientFundsException(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}
}
