package HW09_B11209017;

import java.util.Date;

class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated ;
	Account(){//No-arg constructor, default account
		id=0;
		balance=0;
		annualInterestRate=0;
		dateCreated = new Date();
	}
	Account(int id, double balance){//constructor with arg
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}
	public int getId() {	//setters and getters
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate / 100;//Convert the  annualInterestRate to percentage
	}
	public String getDateCreated() {
		return dateCreated.toString();//To record the created time
	}
	double getMonthlyInterestRate() {
		return getAnnualInterestRate()/12;//MonthlyInterestRate = AnnualInterestRate /12
	}
	double getMonthlyInterest() {//Monthly interest = balance *  Monthly interest rate
		return getBalance()*getMonthlyInterestRate();
	}
	void withdraw(int money) {//Withdraw method
		setBalance(getBalance()-money);
	}
	void deposit(int money) { //Deposit method
		setBalance(getBalance()+money);	
	}
}

public class HW09_B11209017_03 {
	

	public static void main(String[] args) {
		Account account = new Account(1122, 20000);// Create an Account object with ID and balance
		account.setAnnualInterestRate(4.5);// Set annual interest rate
		account.withdraw(2500);// Withdraw money from the account
		account.deposit(3000);// Deposit money into the account
		 // Print account balance, monthly interest, and creation date
		System.out.printf("balance: %f%nmonthly interest: %f%nCreated date:%s",account.getBalance(),account.getMonthlyInterest(),account.getDateCreated());

	}

}
