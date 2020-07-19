package com.montran.main;

import com.montran.pojo.Time;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time T1 = new Time();
		T1.settime(13,10,32);
		
		Time T2 = new Time();
		T2.settime(18,35,36);
		
		Time T3= new Time();
		T3=T1.sum(T2);

		System.out.println("time 1");
		T1.showtime();
		System.out.println("time 2");
		T2.showtime();
		System.out.println("time 3");
		T3.showtime();
		
		}
}
