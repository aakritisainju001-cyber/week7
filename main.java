
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main {
    public static void main(String[] args) {

        bank acc1 = new bank(101, "Aakriti", 5000);
        bank acc2 = new bank(102, "Sita", 8000);

        acc1.deposit(2000);
        acc1.withdraw(1500);

        acc2.deposit(3000);
        acc2.withdraw(4000);

        System.out.println("Final Balance of Accounts:");
        acc1.displayBalance();
        acc2.displayBalance();
    }
}
