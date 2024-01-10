public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String accountHolder, double overdraftLimit) {
        super(accountHolder);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}
