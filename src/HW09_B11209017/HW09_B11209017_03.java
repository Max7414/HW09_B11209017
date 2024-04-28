package HW09_B11209017;

import java.util.Date;

class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated ;
	Account(){
		id=0;
		balance=0;
		annualInterestRate=0;
		dateCreated = new Date();
	}
	Account(int id, double balance){
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}
	public int getId() {
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
		this.annualInterestRate = annualInterestRate / 100;
	}
	public String getDateCreated() {
		return dateCreated.toString();
	}
	double getMonthlyInterestRate() {
		return getAnnualInterestRate()/12;
	}
	double getMonthlyInterest() {
		return getBalance()*getMonthlyInterestRate();
	}
	void withdraw(int money) {
		setBalance(getBalance()-money);
	}
	void deposit(int money) {
		setBalance(getBalance()+money);	
	}
}

public class HW09_B11209017_03 {
	

	public static void main(String[] args) {
		Account account = new Account(1122, 20000);
		account.setAnnualInterestRate(4.5);
		account.withdraw(2500);
		account.deposit(3000);
		System.out.printf("balance: %f%nmonthly interest: %f%nCreated date:%s",account.getBalance(),account.getMonthlyInterest(),account.getDateCreated());

	}

}
