/*Input: Take marks obtained (out of 100) in each subject.
Calculate Total Marks: Sum up the marks obtained in all subjects.
Calculate Average Percentage: Divide the total marks by the total number of subjects to get the
average percentage.
Grade Calculation: Assign grades based on the average percentage achieved.
Display Results: Show the total marks, average percentage, and the corresponding grade to the user*/
import java.util.*;
class StudentDatabase
{
	int n=0;
	int avg=0,tot=0;
	String sub[]=new String[50];
	int mark[]=new int[50];
	String grade=null;
	String name,branch;
	Scanner sc=new Scanner(System.in);
	//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	void getMarks()
	{
		System.out.print("Enter Name of Student : ");
		name=sc.nextLine();
		System.out.print("Enter Branch : ");
		branch=sc.nextLine();
		System.out.print("How many Subject marks do you want to Enter ? : ");
		n=sc.nextInt();
		for(int i=0;i<n; i++)
		{
			System.out.print("\nEnter Name of Subject -"+(i+1)+" : ");
			sub[i]=sc.next();
			System.out.print("Enter Marks of "+sub[i]+"	 : ");
			mark[i]=sc.nextInt();	
		}
	}
	void calculateMarks()
	{
		for(int i=0; i<n; i++)
		{
			tot=tot+mark[i];
		}
		avg=tot/n;
		if(avg>=90)
			grade="A";
		else if(avg>=75 && avg<=90)
			grade="B";
		else if(avg>=60 && avg<=75)
			grade="C";
		else if(avg>=45 && avg<=60)
			grade="D";
		else if(avg>=35 && avg<=45)
			grade="E";
		else
			grade="Fail";
	
	}
	void displayResult()
	{
			System.out.println("\n\t\tMarks Obtained\n=======================================");
			System.out.println(" Name 		: "+name+"\n Branch		: "+branch+"\n=======================================");
			for(int i=0,j=0; i<n||j<n; i++,j++)
			{
					System.out.println(" "+sub[i]+" 		: "+mark[j]);
			}
			System.out.println("=======================================\n Total		: "+tot);
			System.out.println(" Average	: "+avg);
			System.out.println(" Grade		: "+grade+"\n=======================================");
	}
	public static void main(String args[])
	{
		StudentDatabase s1=new StudentDatabase();
		s1.getMarks();
		s1.calculateMarks();
		s1.displayResult();
		
	}
}
