package pharm;

public class Store{

	public String location;
	public String name;

Store(String name, String location){//Constructor to store the location and name

	this.location = location;
	this.name = name;

} 
 //accessor for location of the store
String getLocation() {
	return location;
}
//accessor for the name of the store
String getName() {
	return name;
}
//mutator to set the name for the pharmacy, void return
void setName(String name) {

	this.name = name;
}

//mutator for setting location of pharmacy, void return
void setLocation(String location){
	
	this.location = location;

}
public String toString() {
	return name + " " + location;
}
}//end store class