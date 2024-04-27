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
		this.annualInterestRate = annualInterestRate;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	double getMonthlyInterestRate() {
		return 0;
	}
	double getMonthlyInterest() {
		return 0;
	}
	void withdraw() {
		
	}
	void deposit() {
		
	}
}

public class HW09_B11209017_03 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
