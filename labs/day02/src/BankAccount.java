public class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "The amount must be greater than 0."
            );
        }

        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "The amount must be greater than 0."
            );
        }

        if (amount > balance) {
            throw new IllegalArgumentException(
                    "You don't have enough balance for this."
            );
        }

        balance -= amount;
    }
}