package ATMInterface;


public class BankAccount {
    private double balance;

    // Constructor to initialize the bank account with a given balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Getter to retrieve the current balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit an amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    // Method to withdraw an amount
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}
