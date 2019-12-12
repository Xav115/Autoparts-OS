public class Mitsubitshi_Data implements Cars
{
	public String Maker = "Mitsubishi";
	
	public static int airfilter = 35;
	public static int carburetor = 35;
	public static int distributor = 35;
	public static int petrolpum = 35;
	public static int ignition = 35;
	public static int oilfilter = 35;
	public static int oilpump = 35;
	public static int valvespring = 35;
	
	public static int bumper = 35;
	public static int fenders = 35;
	public static int hood = 35;
	public static int roofRack = 35;
	public static int handle = 35;
	public static int sideSkirt = 35;
	public static int spoiler = 35;
	public static int grilles = 35;
	
	public static int radio = 35;
	public static int ventVisors = 35;
	public static int GPS = 35;
	public static int LED = 35;
	public static int carSunShade = 35;
	public static int mat = 35;
	public static int speakers = 35;
	public static int remoteControlKey = 35;
	
	public String SubstractMotorM(String motor, int amount) {
		if(motor == "Air Filter"){
			  airfilter -= amount;
			  
			  String a= String.valueOf(airfilter);
			  return a;
		  }
		  else if(motor == "Carburetor"){
			  carburetor -= amount; 
			  
			  String a= String.valueOf(carburetor);
			  return a;
		  }
		  else if(motor == "Distributor"){
			  distributor -= amount;
			  
			  String a= String.valueOf(distributor);
			  return a;
		  }
		  else if(motor == "Petrol pump"){
			  petrolpum -= amount;
			  
			  String a= String.valueOf(petrolpum);
			  return a;
		  }
		  else if(motor == "Ignition"){
			  ignition -= amount;
			  
			  String a= String.valueOf(ignition);
			  return a;
		  }
		  else if(motor == "Oil Filter"){
			  oilfilter -= amount;
			  
			  String a= String.valueOf(oilfilter);
			  return a;
		  }
		  else if(motor == "Oil Pump"){
			  oilpump -= amount;
			  
			  String a= String.valueOf(oilpump);
			  return a;
		  }
		  else if(motor == "Vale Spring"){
			  valvespring -= amount;
			  
			  String a= String.valueOf(valvespring);
			  return a;
		  }
		return "";
		
	}
	

	public String SubstractMotorA(String Acc, int amount) {
		  if(Acc == "Radio"){
			  radio -= amount;
			  
			  String a= String.valueOf(radio);
			  return a;
		  }
		  else if(Acc == "Vent Visors"){
			  ventVisors -= amount;
			  
			  String a= String.valueOf(ventVisors);
			  return a;
		  }
		  else if(Acc == "GPS"){
			  GPS -= amount;
			  
			  String a= String.valueOf(GPS);
			  return a;
		  }
		  else if(Acc == "Led Lights"){
			  LED -= amount;
			  
			  String a= String.valueOf(LED);
			  return a;
		  }
		  else if(Acc == "Car Sun Shade"){
			  carSunShade -= amount;
			  
			  String a= String.valueOf(carSunShade);
			  return a;
		  }
		  else if(Acc == "Mat"){
			  mat -= amount;
			  
			  String a= String.valueOf(mat);
			  return a;
		  }
		  else if(Acc == "Speakers"){
			  speakers -= amount;
			  
			  String a= String.valueOf(speakers);
			  return a;
		  }
		  else if(Acc == "Remote Control Key"){
			  remoteControlKey -= amount;
			  
			  String a= String.valueOf(remoteControlKey);
			  return a;
		  }	
		  
		  return "";
	}
	
	
	public String SubstractMotorE(String Ext, int amount) {
		  if(Ext == "Bumper"){
			  bumper -= amount;
			  
			  String a= String.valueOf(bumper);
			  return a;
		  }
		  else if(Ext == "Fenders"){
			  fenders -= amount; 
			  
			  String a= String.valueOf(fenders);
			  return a;
		  }
		  else if(Ext == "Hood"){
			  hood -= amount;
			  
			  String a= String.valueOf(hood);
			  return a;
		  }
		  else if(Ext == "Roof Rack"){
			  roofRack -= amount;
			  
			  String a= String.valueOf(roofRack);
			  return a;
		  }
		  else if(Ext == "Handle"){
			  handle -= amount;
			  
			  String a= String.valueOf(handle);
			  return a;
		  }
		  else if(Ext == "Side Skirt"){
			  sideSkirt -= amount;
			  
			  String a= String.valueOf(sideSkirt);
			  return a;
		  }
		  else if(Ext == "Spoiler"){
			  spoiler -= amount;
			  
			  String a= String.valueOf(spoiler);
			  return a;
		  }
		  else if(Ext == "Grilles"){
			  grilles -= amount;
			  
			  String a= String.valueOf(grilles);
			  return a;
		  }	
		  
		  
		  return "";
	}
}
