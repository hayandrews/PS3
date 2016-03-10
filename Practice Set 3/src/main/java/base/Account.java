package base;

import java.util.Date;

/**
 * 
 * @author Hayley Andrews
 *
 */
public class Account {
	/**
	 * data fields
	 */
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;

	/**
	 * No-arg constructor for default account
	 */
	public Account() {
		this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0;
		this.dateCreated = new Date();
	}

	/**
	 * Creates an Account
	 * 
	 * @param id
	 *            The identification of the account
	 * @param balance
	 *            The amount of money in the account
	 */
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		annualInterestRate = 0;
		dateCreated = new Date();
	}

	/**
	 * getter
	 * 
	 * @return id number
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets id with a new id
	 * 
	 * @param id
	 * 
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * getter
	 * 
	 * @return balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * Sets balance with new balance
	 * 
	 * @param balance
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * getter
	 * 
	 * @return annualInterestRate
	 */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	/**
	 * sets annualInterestRate to new annualInterestRate
	 * @param annualInterestRate
	 */
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	/**
	 * getter
	 * @return dateCreated
	 */
	public Date getDateCreated() {
		return this.dateCreated;
	}

	/**
	 * 
	 * @return the monthly Interest Rate
	 */
	public double getMonthlyInterestRate() {
		return this.annualInterestRate / 12;
	}

	/**
	 * Takes money from balance, if amount taken is higher than balance
	 * exception is thrown
	 * @param amount
	 * @throws InsufficientFundsException
	 */
	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount <= balance) {
			balance -= amount;
		} else {
			throw new InsufficientFundsException(amount - balance);
		}
	}

	/**
	 * adds amount to the balance
	 * @param amount
	 */
	public void deposit(double amount) {
		this.balance += amount;
	}

}
