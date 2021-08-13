public class CashDeposit{

    public double cash;
    private double AddCash;

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public void Cash_deposit(double AddCash){
        cash += AddCash;
        System.out.println("Amount Deposited : " + AddCash);
        System.out.println("Balance : " + cash + " Rs.");
    }
}
