package com.nt.test;

import com.nt.comp.ICar;
import com.nt.factory.CarFactory;

public class CarCustomer {

	public static void main(String[] args) {
		//get car
		ICar car=CarFactory.getinstnce("sport");
		System.out.println(car.getClass());
		car.drive();
		car.addAccessories();
		
	}

}
