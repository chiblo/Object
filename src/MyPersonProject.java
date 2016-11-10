

class Person{
	
	// Variables
	private String firstName;
	private String lastName;
	
	//Constructors
		public Person (){
			
		}
		
		public Person (String firstName, String lastName){
		
			this.firstName= firstName;
			this.lastName= lastName;
		}
		
		
		//Methods
	
		public void setFirstName(String firstName){
			
			this.firstName=firstName;
		}
		
		public void setLastName(String lastName){
			
			this.lastName=lastName;
		}
		
		public String getFirstName(){
			
			return firstName;
		}
	
		public String getLastName(){
			
			return lastName;
		}
	
			
		public void writeLine(){
			
			System.out.println("My name is " + firstName +" "+ lastName);
			
			
		}
	
	
		
}


public class MyPersonProject {

	public static void main(String[] args) {
		
		Person myName= new Person("Amy", "Golkar");
		
		myName.setLastName("Olsson");
		myName.setFirstName("Anna");
		
		
		
		myName.writeLine();
		
		
		
	}

}
