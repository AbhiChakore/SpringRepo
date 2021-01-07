//WishMessage Generator.java (Target Class)
package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	//bean property attribute
private Date date;//after injection it hold system date and time

static {
	System.out.println("WishMessageGenerator::static block");
}


public void setDate(Date date) {
	System.out.println("WishMessageGenerator.setDate(-)");
	this.date = date;
}

//setter method for setter injection
public WishMessageGenerator(Date date) {
	System.out.println("WishMessageGenerator::1-param constructor");
	this.date=date;
}

//b.method
public String generateWishMessage(String user) {
	System.out.println("WishMessageGenerator.generateWishMessage()"+date);
	//get hour of the day
	int hour=date.getHours();//24 hours format
	//generate wish Message
	if(hour<12)
		return "Good Morning::"+user;
	else if(hour<13)
		return "Good Afternoon::"+user;
	else if(hour<20)
		return"Good Evening::"+user;
	else
		return "good night::"+user;
		
	
}


}
