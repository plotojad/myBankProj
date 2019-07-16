package com.mybank.domain;

import java.util.ArrayList;

public class Bank {

    private static ArrayList<Customer> customers = new ArrayList<>();
    
    private static int numOfClients = 0;
    
    private static Bank myBank = new Bank();

    public static Bank getBank() {
        return myBank;
    }

    private Bank() {
    }

    public static Customer getCustomer(int cusNo) {
        if (cusNo < customers.size()){
            return customers.get(cusNo);
        }
        return null;
    }

    public static void addCustomer(Customer newCustomer) {
        customers.add(newCustomer);
        numOfClients++;
    }

    public static int getNumOfClients() {
        return numOfClients;
    }
    
    
}
