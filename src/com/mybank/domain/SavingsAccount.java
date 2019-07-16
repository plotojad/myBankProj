package com.mybank.domain;

public class SavingsAccount extends Account {

    private double interestRate;
    private double overdraftAmount;
    
    public SavingsAccount(double initBalance, double interestRate) {
        this.balance = initBalance;
        this.interestRate = interestRate;
        this.overdraftAmount = overdraftAmount;
    }
    
    public void addInterestRate (){
        this.balance= this.balance * (1 + interestRate);
    }

    public double getInterestRate() {
        return interestRate;
    }
    
    @Override
    public boolean withdraw(double amt) throws OverdraftException {
        if (amt <= balance + overdraftAmount) {
            balance = balance - amt;
            return true;
        }
        throw new OverdraftException(amt - balance - overdraftAmount, "Error! Insufficient funds!\n");
    }

    public double getOverdraftAmount() {
        return overdraftAmount;
    }
    
    
}
