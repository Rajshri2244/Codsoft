import java.util.Scanner;

public class UserBank{
        Scanner sc=new Scanner(System.in);
        float balance=0;
        public void storeBalance()
        {
            System.out.print("Enter the Amount to Deposit ? : ");
            balance=sc.nextFloat();
            System.out.println("Amount Deposit succesfully!!!");
        }
        public static void main(String args[])
        {
            Scanner sc1=new Scanner(System.in);
            ATM a1=new ATM();
            int ch=0;
            do
            {
                System.out.println("\n\n========= ATM ===========\n1.Deposit Money \n2.Withdraw Money \n3.Check Balance\n4.Exit\n");
                System.out.print("Enter Your Choice : ");
                ch=sc1.nextInt();
                switch(ch){
                    case 1:a1.depositMoney();
                            break;

                    case 2:a1.withdrawMoney();
                            break;

                    case 3:a1.checkBalance();
                            break;
                    case 4:System.exit(0);
                           System.out.println("Thank You!!!!");
                            break;
                    default:System.out.print("Enter Valid choice (1\2\3\4) : "); 
                }
            }while(ch!=5);
        }
}