package com.nt.test;

import com.nt.comps.Vehicle;
import com.nt.factory.VehicleFactory;

public class StrategyDpTest1 {

	public static void main(String[] args) {
		try {
			//get vehicle object (target class obj)
			Vehicle vehicle=VehicleFactory.getInstance("Water");
			//invoke b.method
			vehicle.journey("India","Dubai");
			
		}
		catch(IllegalArgumentException iae) {
			iae.printStackTrace();
		}

	}

}
