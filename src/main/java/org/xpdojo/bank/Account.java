package org.xpdojo.bank;

public class Account {

    private int balance;

    public Account() {
        this.balance = 0;
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
}
