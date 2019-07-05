import java.util.*;
public class employerScheduleVacations {
	public static int total=0;
	private static Scanner input;
	public static int totalSalary =200000;
	public static int newSalary;
	public static int empSalary;
	int totalvac=0;
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("please enter the total number of employees");
		int n=input.nextInt();
		for (int i=0;i<n;i++) {
			System.out.println("Please enter your name and after that enter how much vacation do you need for the summer(in days)");
			String name=input.nextLine();
			int vac =input.nextInt();
			int vacmax=0;
			String maxname;
			if (vac>vacmax) {
				vacmax=vac;
				maxname=name;
			}
			
			total+=vac;				
		}
		if(total>1100) {
			System.out.println("Watch out there are much more vacation days than its supposed to");
			System.out.println("This means that there must be some reduction in salary");
			newSalary=totalSalary-(total-1100);
			System.out.println("Attention please!! since your total vacation days is " +total+ "which is more than it should we'll have some changes" );
			empSalary=newSalary/n;
			System.out.println("Guys im sorry but your new salary is: "+ empSalary );
		 }	
		else if(total<1100) {
			System.out.println("Attention please!! Since your total vacation days is" + total +" you'll have an increase in salary" );
			newSalary=totalSalary+(total-1100);
			empSalary=newSalary/n;
			System.out.println("Cheers lads this is your new salary: "+ empSalary);
			int percent=(empSalary-totalSalary)/100;
			System.out.println("Your wage has been increased by: "+percent+"%");
		}

	}

}
