package day2_switch_loop_array;

import java.util.Scanner;

//wap to ask password from user and check if password==1234
//then print allowed else ask him to reenter password 
//max 3 chance is allowed after that print password blocked
public class Passwordcheck {

	public static void main(String[] args) {
		 
		int pass;
		Scanner s= new Scanner(System.in);
		int i;
		System.out.println("enter password");
		for(  i=1;i<=3;i++)
		{
		
		pass=s.nextInt();
		if(pass==1234)
		{
			System.out.println("accepted");
			break;// take control out of loop 
		}
		else if(i<3)
			System.out.println("enter re password");
		}
		
		if(i==4)
		{
			System.out.println("card  is blocked");
		}

		
	}

}
