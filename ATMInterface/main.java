package ATMInterface;


public class main {
    public static void main (String[] args) {
        
        BankAccount account = new BankAccount(1000);
        
        
        ATM atm = new ATM(account);
        
        ATMInterface atmInterface = new ATMInterface(atm);
        
        atmInterface.showMenu();
    }
}
