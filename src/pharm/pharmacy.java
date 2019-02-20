package pharm;

class Pharmacy extends Store{
	
	double prescriptions;
	double patients;
	//constructor for the pharmacy
Pharmacy(String name, String location, int prescriptions, int patients){
		//initializing the pharmacy constructs
		super(name, location);
		//filling in info for prescriotions and patients
		this.prescriptions = prescriptions;
		this.patients = patients;
		}
	
	//mutators for pharmacy info, void return

	void setPrescrips(int prescrip) {
		this.prescriptions = prescrip;
	}
	
	void setPatientNumber(int number) {
		this.patients = number;
	}
	
	//accessors for the class pharmacy, returns info as doubles
	
	double getPatientNumber() {
		return patients;
	}
	
	double getPrescrips() {
		return prescriptions;
	}
	//finding average of prescriptions per person per pharmacy
	
	double average() {
		return prescriptions / patients;
	}
	
	
}//end pharmacy class