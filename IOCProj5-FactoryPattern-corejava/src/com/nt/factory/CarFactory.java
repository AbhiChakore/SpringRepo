package com.nt.factory;

import com.nt.comp.BudgetCar;
import com.nt.comp.ICar;
import com.nt.comp.LuxoryCar;
import com.nt.comp.SportCar;

public class CarFactory {
	public static ICar getinstnce(String type) {
		ICar car=null;
		if(type.equalsIgnoreCase("luxory"))
			car=new LuxoryCar();
		else if(type.equals("budget"))
			car=new BudgetCar();
		else if(type.equalsIgnoreCase("sport"))
			car=new SportCar();
		else 
			throw new IllegalArgumentException("invalid car type");
		return car;
		
	}

}
