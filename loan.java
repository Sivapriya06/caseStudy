package Bank;

public abstract class loan implements bankAccount {
    long principle_amt = 30000;
    int year = 3;
    long interest;
    int interest_rate=10;
    public void createAccount()
    {
        System.out.println("Loan account created");
    }
    public void  interestRate()
    {
        System.out.println("The interest rate for Loan account is 10%");
    }
    public void getinterest_details()
    {

        interest=(principle_amt*year*interest_rate)/100;
        System.out.println("The amount after calculating interest rate for loanaccount is : "+interest);
    }

}
