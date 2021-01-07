package com.nt.test;

import com.nt.comps.Vehicle;
import com.nt.factory.VehicleFactory;
public class StrategyDpTest2 {

	public static void main(String[] args) {
		try {
		//get Vehicle
		Vehicle vehicle=VehicleFactory.getInstance("Petrol");
		//Invoke b.method
		vehicle.journey("India","Goa");

	}
	catch(IllegalArgumentException iae) {
		iae.printStackTrace();
	}

}
}
