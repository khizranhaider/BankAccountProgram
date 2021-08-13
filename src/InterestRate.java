public class InterestRate extends BalanceCheck{
    private double IR;

    public void Interest(double IR){
        double interest = cash * (IR / 100);
        System.out.println("Monthly Interest On " + cash + " Rs. is : " + interest + " Rs.");
    }
}
