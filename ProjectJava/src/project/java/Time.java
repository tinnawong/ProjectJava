package project.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Time {
	
	
	private int chooseTime=1;	
	static Date today=null ;
	static String putdate;
	
	public int getChooseTime() {
		return chooseTime;
	}
	
	public void setChooseTime(int chooseTime) {
		this.chooseTime = chooseTime;
	}
	
	public Date getToday() {
		timeNow();
		return today;
	}
	
	public void timeNow(){
		if(chooseTime==1) {
			LocalDate date = LocalDate.now();
			LocalDateTime dateTime = LocalDateTime.now();
			 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			 
			 String checkinOut=""+date+" "+dateTime.getHour()+":"+dateTime.getMinute();
			try {
				today = format.parse(checkinOut);
				//System.out.println(checkinOut);
				//System.out.println(date);
				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		else if(chooseTime==2) {
			
			 SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy HH:mm");
			 //String checkinOut="30/4/2561 12:30";
			 ParkingProgram parking = new ParkingProgram();
			 
			 try {
				today = format.parse(putdate);
				//System.out.println(today);
				//System.out.println("time in :"+(today.getDate())+" "+(today.getMonth()+1)+" "+(today.getYear()+2443));
			} catch (ParseException e) {
				
				e.printStackTrace();
			}
		}
		
		 
	 }
	
	
	
	 
	
	
	

}
