package Bank;

import java.util.Scanner;

public class main {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your choice Loan->1,CurrentAccount->2,SavingAccount->3 : ");
        int choice= scan.nextInt();
        switch (choice) {
            case 1:
                educationloan obj1 = new educationloan();
                obj1.createAccount();
                obj1.interestRate();
                obj1.getinterest_details();
                break;

            case 2:
                basicCurrentAccount obj2 = new basicCurrentAccount();
                obj2.createAccount();
                obj2.interestRate();
                obj2.getinterest_details();
                break;

            case 3:
                basicSavingsAccount obj3 = new basicSavingsAccount();
                obj3.createAccount();
                obj3.interestRate();
                obj3.getinterest_details();
                break;
        }
    }
}
