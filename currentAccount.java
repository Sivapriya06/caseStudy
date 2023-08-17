package Bank;

import java.util.Scanner;
public abstract class currentAccount implements bankAccount {
    long principle_amt = 100000;
    int year = 8;
    long interest;
    int interest_rate=7;

    Scanner obj=new Scanner("System.in");
    int deposit;
    public void createAccount()
    {
        System.out.println("Current account created");
    }
    public void  interestRate()
    {
        System.out.println("The interest rate for Currentaccount is 7%");

    }
    public void getinterest_details()
    {

        interest=(principle_amt*year*interest_rate)/100;
        System.out.println("The amount after calculating interest rate for current account is : "+interest);
    }
}
