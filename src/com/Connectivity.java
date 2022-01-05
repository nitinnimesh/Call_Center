package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Connectivity {
	
	
 static void LongestCalls() {	 
	 int starttime=0;
	 int endtime =1;
	 List<Integer> list=new ArrayList<Integer>();  
	 
	while(starttime<23) {
		
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/call_center","root","root");  
			Statement stmt=con.createStatement();  
			
			ResultSet rs=stmt.executeQuery("select Sum(Duration) from call_center  where hour(StartTime)="+starttime+" ;");  
			while(rs.next()) { 
			
			list.add(rs.getInt(1));
			}
			con.close();  
			}catch(Exception e){ System.out.println(e);}
		
		starttime++;
		endtime++;
	
	}
	int obj = Collections.max(list);
	int start = list.indexOf(obj);
	int end =start+1;
	String time;
if(start <12) {
	 time ="AM";
}
else {
	
	time ="PM";
}

	System.out.println("Hour of the day when the calls are longest is from "+start+" to "+end+"  "+time);	
	Main.main(null);

}
 
 
 
 static void highestVolume() {
 
 
 int starttime=0;
 int endtime =1;
 List<Integer> list=new ArrayList<Integer>();  
 
while(starttime<23) {
	
	try{  
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/call_center","root","root");  
		Statement stmt=con.createStatement();  
		
		ResultSet rs=stmt.executeQuery("select count(id) from call_center  where hour(StartTime)="+starttime+" ;");  
		while(rs.next()) { 
		
		list.add(rs.getInt(1));
		}
		con.close();  
		}catch(Exception e){ System.out.println(e);}
	
	starttime++;
	endtime++;

}
int obj = Collections.max(list);
int start = list.indexOf(obj);
int end =start+1;
String time;
if(start <12) {
 time ="AM";
}
else {

time ="PM";
}

System.out.println("Hour of the day when the call volume is highest from"+start+" to "+end+"  "+time);

	
Main.main(null);
	
 }
	
}
