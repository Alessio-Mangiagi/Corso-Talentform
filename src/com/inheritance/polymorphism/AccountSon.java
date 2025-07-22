package com.inheritance.polymorphism;

public class AccountSon extends AccountFather {
    private int nameAccount;

    public AccountSon(int nameAccount, int balance, int firstDeposit, int firstDraw, int secondDeposit, int secondDraw) {
        super(balance, firstDeposit, firstDraw, secondDeposit, secondDraw);
        this.nameAccount = nameAccount;
    }

    public static void main(String[] args) {
        
        AccountSon s = new AccountSon(0, 600, 50, 100, 50, 25);
        System.out.println("Primo deposito: " + s.getFirstdeposit());
    }
}


