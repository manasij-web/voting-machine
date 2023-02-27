package javabasic;

import java.util.Scanner;

public class VotingMachine {

	public static void main(String[] args) {

		int age = 0;
		String name = "nm";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number for voters: ");
		int index = sc.nextInt();
		int[] ag = new int[index];
		String[] nm = new String[index];
		long[] phoneno = new long[index];

		for (int i = 0; i < ag.length; i++) {

			System.out.println("Enter Age: ");
			age = sc.nextInt();
			System.out.println("Enter Name: ");
			name = sc.next();
			// System.out.println("enter phone number:");
//		long phno=sc.nextLong();

			ag[i] = age;
			nm[i] = name;

			System.out.println("OUTPUT: ");

			if (ag[i] >= 18) {
				System.out.println("****************************************************************");
				System.out.println("name:" + nm[i]);
				System.out.println("Age:" + ag[i]);

				System.out.println("eligible for voting");
				System.out.println("enter phone number:");
				// Scanner s=new Scanner(System.in);
				long phno = sc.nextLong();

//			
				phoneno[i] = phno;
				System.out.println("contact no:" + phoneno[i]);
			}

			else {
				System.out.println("***************************************************************");
				System.out.println("name:" + nm[i]);
				System.out.println("Age:" + ag[i]);
				System.out.println("too younge");

			}

//		ag[i]=age;
//		nm[i]=name;
//		 
//		System.out.println("name:"+ag);
//		System.out.println("name:"+nm);
//		System.out.println("name:"+phoneno);
//		System.out.println("name:"+);

		}
	}

}
