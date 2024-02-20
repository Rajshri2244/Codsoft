import java.util.*;
class RandomNumber
{
	int rnum,guess;
	int i;
	int num;
	int win=0;
	int loose=0;
	Scanner sc=new Scanner(System.in);
	Random rand=new Random();
	void generateNum()
	{
			 num=rand.nextInt(100);
	}
	void checkGuess()
	{
		rnum=num;
		i=0;
		//System.out.println("Random : "+rnum);
		do
		{
			guess=sc.nextInt();
			if(rnum==guess)
			{
				System.out.println("You win!! You guess the right random number : "+guess);
				win=win+1;
				break;
			}
			else if(rnum>=guess)
			{
				System.out.println("Your guessed number is smaller please enter bigger number");
			}
			else if(rnum<=guess)
			{
				System.out.println("Your guessed number is Greater please enter smaller number");
			}
			else
			{
				System.out.println("You guess wrong number "+guess);
			}
			i++;
			//System.out.println("I = "+i);
		}while(i!=5);
		if(rnum!=guess)
		{
			System.out.println("You lost!!! the random number is : "+rnum);
			loose++;
		}	
	}
	public static void main(String args[])
	{
		RandomNumber r1=new RandomNumber();
		Scanner sc1=new Scanner(System.in);
		System.out.println("===== Welcome User =====");
		System.out.println("You have total 5 chances to guess number ");
		System.out.println("_______________________________________\n");
		char ch;
		int round=0;
		do
		{
			System.out.println("=== Guess Number Between 1 to 100 === \n");
			r1.generateNum();
			System.out.print("Enter Your guess number  : ");
			r1.checkGuess();
			System.out.println("Do you want to play again?(yes/no)");
			ch=sc1.next().charAt(0);
			round++;
		}while(ch=='Y'||ch=='y');
		System.out.println("Total Round : "+round);
		System.out.println("win 	: "+r1.win);
		System.out.println("Loose	: "+r1.loose);
		System.out.println("========Thank You========");
	}
}