import java.util.Scanner;
class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;
    BankAccount (String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited: " + amount);
    }
    void withdraw(double amount) {
        if(amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
    double checkBalance() {
        return balance;
    }
    void displayAccount() {
        System.out.println("\n Account Details");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balnce: " + balance);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number: ");
        String accountNumber = sc.nextLine();
        System.out.println("Enter Account Holder Name: ");
        String accountHolderName = sc.nextLine();
        System.out.println("Enter Initial Balance: ");
        double balance = sc.nextDouble();
        BankAccount account = new BankAccount (
            accountNumber,
            accountHolderName,
            balance
        );
        System.out.println("Enter Amount to deposit: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);
        System.out.println("Enter Amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);
        account.displayAccount();
        sc.close();
    }
}
