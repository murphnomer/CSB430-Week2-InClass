
public class main {
    public static void main(String[] args) throws InsufficientFundsException {
        Account account1 = new Account("mike regular");
        account1.deposit(300);
        Account account2 = new SavingsAccount("mike savings", .25);
        account2.deposit(200);
        account2.withdraw(300);
        Account account3 = new CheckingAccount("mike checking", 300.00);
        account3.deposit(500);

        System.out.println(account1);
        System.out.println();
        System.out.println(account2);
        System.out.println();
        System.out.println(account3);
    }
}
