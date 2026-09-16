import java.util.Scanner;

public class BankApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount(0.0);

        int option;

        do {
            System.out.println("Choose an option \n" +
                    "1 - Check balance \n" +
                    "2 - Deposit \n" +
                    "3 - Withdraw \n" +
                    "4 - Exit");

            option = sc.nextInt();

            switch(option){
                case 1:
                    System.out.println(account.getBalance());
                    break;
                case 2:
                    try{
                        System.out.println("Enter the desired amount:");
                        double amount = sc.nextDouble();
                        account.deposit(amount);
                    } catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Enter the desired amount:");
                        double amount = sc.nextDouble();
                        account.withdraw(amount);
                    } catch(IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while(option != 4);
    }
}
