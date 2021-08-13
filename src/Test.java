import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        CreateAccount A1 = new CreateAccount();

        System.out.println("ACCOUNT CREATION");
        A1.Username();
        A1.Password();

        System.out.println("CASH DEPOSIT");
        A1.setCash(100);
        A1.Cash_deposit(250);

        System.out.println("CASH WITHDRAWAL");
        A1.Cash_Withdrawal(500);

        System.out.println("BALANCE CHECK");
        A1.Balance_Check();

        System.out.println("INTEREST ON BALANCE");
        A1.Interest(5);
    }
}
