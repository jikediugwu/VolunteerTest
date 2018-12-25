/**
 * Jeff Ikediugwu
 * CMSY 166-002
 * A program to store first name, last name and hours available
 */
package volunteertest;

public class Volunteer {
	private String firstName;
	private String lastName;
	private int hoursAvailable;
	
	public Volunteer (String firstName, String lastName, int hoursAvailable) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.hoursAvailable = hoursAvailable;
	} // end of constructor with parameters
	public Volunteer() {
		
	} // end of constructor with no parameters
	
	public void setFirstName(String fname) {
		firstName = fname;
	} // end of firstname method
	
	public void setLastName(String lname) {
		lastName = lname;
	} // end of lastname method
	
	public String getName() {
		return firstName + " " + lastName;
	} //end of getName method
	
	public void setHoursAvailable(int hours) {
		hoursAvailable = hours;
	}
	
	public int getHoursAvailable() {
		return hoursAvailable;
	} // end of getHours Available method

} // end of volunteer class
