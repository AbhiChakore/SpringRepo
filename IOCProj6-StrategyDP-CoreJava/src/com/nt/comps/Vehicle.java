//Vehicle.java(taregetclass)
package com.nt.comps;

public final class Vehicle {
	private IEngine engg;//Has-A property/composition
	
	public void setEngg(IEngine engg) {
		this.engg=engg;
	}
	
	public void journey(String sourceplace,String destplace) {
		engg.start();
		System.out.println("Journey started at::"+sourceplace);
		System.out.println("journey is going on.....");
		engg.stop();
		System.out.println("Journey ended at::"+destplace);
	}
	
}
