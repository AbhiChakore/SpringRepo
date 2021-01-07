package com.nt.factory;

import com.nt.comps.DieselEngine;
import com.nt.comps.IEngine;
import com.nt.comps.PetrolEngine;
import com.nt.comps.Vehicle;

public class VehicleFactory {
	
	public static Vehicle getInstance(String engineType) {
		IEngine engg=null;
		//create dependent class object
		if(engineType.equalsIgnoreCase("diesel"))
			engg=new DieselEngine();
		else if(engineType.equalsIgnoreCase("petrol"))
			engg=new PetrolEngine();
		else
			throw new IllegalArgumentException("Invalid engine type");
		
		//create target class object
		Vehicle vehicle=new Vehicle();
		//assign dependent object to target class object
		vehicle.setEngg(engg);
		return vehicle;
		
		
		
	}
	

}
