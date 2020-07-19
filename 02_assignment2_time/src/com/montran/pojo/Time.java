package com.montran.pojo;

public class Time {
	private int hours;
	private int minutes;
	private int seconds;
	
	public void settime(int hour,int minutes,int seconds)
	{
		this.hours=hour;
		this.minutes=minutes;
		this.seconds=seconds;
	}
	
	public void showtime() {
		// TODO Auto-generated method stub
		System.out.println(+hours+"HOURS:" +minutes+ "MINUTES:"+seconds+ "SECONDS" );

		
	}

	public Time sum(Time t2) {
		// TODO Auto-generated method stub
		Time t3 = new Time();
		t3.seconds=seconds+t2.seconds;
		t3.minutes=minutes+t2.minutes;
		t3.hours=hours+t2.hours;
		
		
		
		if (t3.seconds >=60 )
		{
			t3.minutes=t3.minutes+1;
			t3.seconds=t3.seconds-60;
			
		}
		
		
		if (t3.minutes >= 60)
		//{
			//t3.hours=t3.hours/60;
			//t3.minutes=t3.minutes%60;
			//t3.hours=t3.hours+1;
		//}
		if(t3.minutes>=60)
		{
			t3.hours=t3.hours+1;
			t3.minutes= t3.minutes-60;
		}

		if (t3.hours >= 24)
	     {
			t3.hours%=24;
			
		}
		return(t3);
		}

	}

	

	
