package com.inheritance.polymorphism;

public class AccountFather {
	private int balance;
	private int firstdDeposit;
	private int firstDraw;
	private int seconfDeposit;
	private int secondDrow;

	
	public AccountFather(int balance, int firstdDeposit, int firstDraw, int seconfDeposit, int secondDrow) {
		super();
		this.balance = balance;
		this.firstdDeposit = firstdDeposit;
		this.firstDraw = firstDraw;
		this.seconfDeposit = seconfDeposit;
		this.secondDrow = secondDrow;
	}
	
	
	
	

	public int getFirstdeposit () {
		return balance + firstdDeposit;
	}
	
	public int getFirstDraw() {
		return getFirstdeposit() + firstDraw;
	}
	
	
	public int getSecondDeposit () {
		return getFirstDraw() + seconfDeposit;
	}
	
	public int getTotalAccount () {
		return getSecondDeposit() - secondDrow;
	}
	
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getFirstdDeposit() {
		return firstdDeposit;
	}

	public void setFirstdDeposit(int firstdDeposit) {
		this.firstdDeposit = firstdDeposit;
	}



	public void setFirstDraw(int firstDraw) {
		this.firstDraw = firstDraw;
	}

	public int getSecondDrow() {
		return secondDrow;
	}

	public void setSecondDrow(int secondDrow) {
		this.secondDrow = secondDrow;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
