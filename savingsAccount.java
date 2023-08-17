package Bank;

public abstract class savingsAccount implements bankAccount {
    long principle_amt = 88000;
    int year = 5;
    long interest;
    int interest_rate=6;
    public void createAccount()
    {
        System.out.println("Savings account created");
    }
    public void  interestRate()
    {
        System.out.println("The interest rate for Savingsaccount is 6%");
    }
    public void getinterest_details()
    {

        interest=(principle_amt*year*interest_rate)/100;
        System.out.println("The amount after calculating interest rate for savingsaccount is : "+interest);
    }
    public void minimumBalance()
    {
        System.out.println("The minimum balance for savingsaccount is 2000.Please maintain it");
    }
}
