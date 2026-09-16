import java.util.Scanner;

public class BankApp1 {

    private static double balance = 1000.0;

    public static double getBalance() {
        return balance;
    }

    public static double deposit(double value) {
        balance += value;
        return balance;
    }

    public static double withdraw(double value) {
        balance -= value;
        return balance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;

        do {

        System.out.println("Choose an option \n1 - Check balance \n2 - Deposit \n3 - Withdraw \n4 - Exit");

        option = sc.nextInt();
        double value;

        if(option == 1){
            System.out.println("SALDO = " + getBalance());
        } else if(option == 2){
            try {
                System.out.println("How much do you want to deposit?");
                value = sc.nextDouble();

                if (value <= 0){
                    throw new IllegalArgumentException("Invalid value.");
                }

                deposit(value);
                System.out.println("DEPOSITED AMOUNT = " + value);
                System.out.println("BALANCE = " + getBalance());

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } else if(option == 3){
            try {
                System.out.println("How much do you want to withdraw?");
                value = sc.nextDouble();

                if (value <= 0){
                    throw new IllegalArgumentException("Invalid value.");
                }

                if (value > balance){
                    throw new IllegalArgumentException("The amount cannot exceed the balance.");
                }

                withdraw(value);
                System.out.println("DRAWN AMOUNT = " + value);
                System.out.println("BALANCE = " + getBalance());

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } else if(option == 4){
            System.out.println("Goodbye!");
        } else {
            System.out.println("Invalid option.");
        }
    } while (option != 4);
    }
}