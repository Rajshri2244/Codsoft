import java.util.Scanner;

public class ATM extends UserBank{
    
    float withdraw,deposit;
     Scanner sc=new Scanner(System.in);
    public void withdrawMoney()
    {
        System.out.print("Enter amount which you want to withdraw? : ");
        withdraw=sc.nextFloat();
        if(balance==0)
        {
            System.out.println("You have 0 amount in your account!!!");
        }
        else if(withdraw>balance)
        {
            System.out.println("insufficient balance!!! not able to withdraw your amount!!!");
        }
        else
        {
            balance=balance-withdraw;
            System.out.println("Amount withdraw succesfully!!!");
        }
    }
    public void depositMoney()
        {
            if(balance==0)
            {
                storeBalance();
            }
            else
            {
                System.out.print("Enter amount which you want to deposit? : ");
                deposit=sc.nextFloat();
                balance=balance+deposit;
                System.out.println("Amount Deposit succesfully!!!");
            }
        }
    public void checkBalance()
        {
        System.out.println("Your Total Bank Balance : "+balance);
    }

}

