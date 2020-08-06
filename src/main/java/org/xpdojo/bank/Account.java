package org.xpdojo.bank;

public class Account {

    private int balance;

    private Account() {
        this.balance = 0;
    }

    public static Account createAccount() {
        return new Account();
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public int balance()
    {
        return balance;
    }

    public void deposit(int amount) {
        this.balance = this.balance + amount;
    }

    public Boolean withdraw(int i) {
        throw new RuntimeException("operation not supported");
    }


}
