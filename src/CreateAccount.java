import java.util.Scanner;

public class CreateAccount extends InterestRate{

    private String UserName;
    private double Password;

    Scanner sc = new Scanner(System.in);

    public void Username(){
        System.out.println("Enter your User Name : ");
        UserName = sc.nextLine();
    }

    public void Password(){
        int x = 1;
        Scanner sc = new Scanner(System.in);
        while(x > 0){
            System.out.println("Enter your Password : ");
            double i = sc.nextDouble();
            if(i > 1000 && i < 9999) {
                double Password = i;
                x = 0;
            }
            else{
                System.out.println("Invalid Password! Please enter 4 digits only.");
                x = 1;
            }
        }
    }
}
