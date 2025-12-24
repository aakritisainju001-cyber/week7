
/**
 * Write a description of class bank here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bank{
    private int accountNumber;
    private String holderName;
    private double balance;

   
    bank(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    
    void deposit(double amount) {
        balance += amount;
    }

    
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance for account " + accountNumber);
        }
    }

    
    void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Current Balance: ₹" + balance);
        System.out.println("---------------------------");
    }
}
