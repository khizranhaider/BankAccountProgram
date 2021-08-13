public class CashWithdrawal extends CashDeposit {
    private int WithdrawCash;

    public void Cash_Withdrawal(double WithdrawCash) {
        System.out.println("Cash Withdrawal Request : " + WithdrawCash + " Rs.");
        if (WithdrawCash <= cash)
            cash -= WithdrawCash;
        else
            System.out.println("You don't have enough Balance.");

        System.out.println("Remaining Balance : " + cash + " Rs.");
    }
}
