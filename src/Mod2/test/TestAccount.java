
package Mod2.test;

import com.mybank.domain.Bank;
import com.mybank.domain.CheckingAccount;
import com.mybank.domain.Customer;
import com.mybank.domain.OverdraftException;
import com.mybank.domain.SavingsAccount;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TestAccount {

    public static void main(String[] args) {

        Customer firstCustomer = new Customer("John", "Doe");
        Customer secondCustomer = new Customer("Kulo", "Holo");

        SavingsAccount johnSavings = new SavingsAccount(1000, 10);
        CheckingAccount johnAccount = new CheckingAccount(5000, 1000);
        CheckingAccount kuloAccount = new CheckingAccount(500, 100);

        firstCustomer.addAccount(johnSavings);
        firstCustomer.addAccount(johnAccount);
        secondCustomer.addAccount(kuloAccount);

        Bank.addCustomer(firstCustomer);
        Bank.addCustomer(secondCustomer);

        System.out.println(Bank.getCustomer(0));
        System.out.println(Bank.getCustomer(1));

        Bank.getCustomer(0).getAccount(0).deposit(2000);
        try {
            Bank.getCustomer(0).getAccount(1).withdraw(7500);
        } 
        catch (OverdraftException ex){
            System.out.println(ex.getMessage()+": $"+ex.getDeficit()+"!\n");
                    }
        catch (Exception ex) {
            System.out.println("Something went wrong:  "+ex.getMessage());
        }
        ((SavingsAccount) Bank.getCustomer(0).getAccount(0)).addInterestRate();
        System.out.println("");

        System.out.println(Bank.getCustomer(0));
        System.out.println(Bank.getCustomer(1));

    }

}
