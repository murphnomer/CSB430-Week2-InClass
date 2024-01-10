public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(String accountHolder, double interestRate) {
        super(accountHolder);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
