public class Account {
    protected int accountNumber;
    protected String accountHolder;
    protected double balance;

    private static int nextAccountNumber = 1;

    public Account(String accountHolder) {
        accountNumber = nextAccountNumber++;
        this.accountHolder = accountHolder;
        balance = 0.0;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        assert amount > 0;

        balance += amount;

        return balance;
    }

    public double withdraw(double amount) throws InsufficientFundsException {
        assert amount > 0;

        if (amount > balance) {
            throw new InsufficientFundsException();
        }

        balance -= amount;

        return balance;
    }

    public String toString() {
        return accountHolder + "'s account, #" + accountNumber + ", balance: $" + balance;
    }
}
