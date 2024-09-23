package ATMInterface;


import java.util.Scanner;

public class ATMInterface {
    private final ATM atm;

    // Constructor to initialize the ATM object
    public ATMInterface(ATM atm) {
        this.atm = atm;
    }

    // Method to display the ATM menu and handle user input
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nATM Machine");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            // Process user input
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                }
                case 2 -> {
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                }
                case 3 -> atm.checkBalance();
                case 4 -> {
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
