package pharm;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pharmacy pharm1 = new Pharmacy("name", "Boisie", 213, 22);
		Pharmacy pharm2 = new Pharmacy("name", "Kennesaw", 173, 32);
		
		//setting names of the pharmacies!
		pharm1.setName("Andy's Pharmacy");
		pharm2.setName("KSU Student-Pharmacy");
		
		
		//setting prescriptions and customers
		
		pharm1.setPrescrips(1233);
		pharm2.setPrescrips(2136);
		
		pharm1.setPatientNumber(433);
		pharm2.setPatientNumber(1002);
		//examples of the get methods
		
		//getting names
		System.out.println("Pharmacy names using method: getName");
		System.out.println("Pharmacy 1: " + pharm1.getName());
		System.out.println("Pharmacy 2: " + pharm2.getName());
		System.out.println(" ");
		
		//getting locations
		
		System.out.println("Pharmacy locations using method: getLocation");
		System.out.println("Pharmacy 1: " + pharm1.getLocation());
		System.out.println("Pharmacy 2: " + pharm2.getLocation());
		System.out.println(" ");
		
		//strings of the pharmacies
		
		System.out.println(pharm1);
		System.out.println(pharm2);

		System.out.println(" ");
		
		//equals or not
		if (pharm1.equals(pharm2))
			System.out.print("Same pharmacy!");
		else
			System.out.print("Not the same pharmacy!");
		
		//averages of prescriptions
		System.out.println(" ");
		System.out.println("Average for Pharmacy 1 =  " + pharm1.average());
		System.out.println("Average for Pharmacy 2 =  " + pharm2.average());
	
		
	}
	
	
	
	
	

}
