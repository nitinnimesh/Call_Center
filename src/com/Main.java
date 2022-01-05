package com;
import java.io.*;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
	
			Scanner scan = new Scanner(System.in);

		
				System.out.println("Option 1:  Hour of the day when the call volume is highest.");
				System.out.println("Option 2: Hour of the day when the calls are longest.");	
				System.out.println("Type your Option ");
				int input=scan.nextInt();
				
			 switch(input){  
			
			    case 1: 				    	
			    	Connectivity.highestVolume();
			  break;
			    case 2:
					Connectivity.LongestCalls();
			    
			    break;  


	}

}
}

