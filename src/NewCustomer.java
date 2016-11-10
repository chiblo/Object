
public class NewCustomer {
	
	
	
	//Variables
	private String title;
	private String firstName;
	private String surName;
	
	private String address;
	private String phoneNumber;
	private String email;
	
	private int customerNumber;
	private GenderType gender;
	private boolean isValid;
	
	
	
	
	// Constructor
	
	public NewCustomer(){
		
	}
	
	public NewCustomer(String title, String firstName,String surName, String address, String phoneNumber,String email, int customerNumber,
			GenderType gender){
		
		
		setName(title,firstName,surName, address, phoneNumber,email, customerNumber,
				gender,isValid );
	}
	
	
	// Methods
	
	
	//Setters
	private void setName(String title, String firstName,String surName, String address, String phoneNumber,String email, int customerNumber,
						GenderType gender,boolean isValid){
		
		this.title=title;
		this.firstName=firstName;
		this.surName=surName;
		this.address=address;
		this.phoneNumber=phoneNumber;
		this.email=email;
		this.customerNumber=customerNumber;
		this.gender=gender;
		this.isValid=true;
		
	}
	
	
	
		//Getters
	
	public String getFirstName(){
		
		return firstName;
	}

	public String getSurName(){
		
		return surName;
	}
	
	public String getTitle(){
		
		return title;
		}
	
	public String getAdress(){
		
		return address;
	}

	public String getPhoneNumber(){
		
		return phoneNumber;
	}

	public String getEmail(){
	
	return email;
	}
	
	public int getCustomerNumber(){
		
		return customerNumber;
	}

	public GenderType getGender(){
		
		return gender;
	}

	public boolean getValid(){
	
	return isValid;
	}
	
	
	public String getMailingName(){
		
		String mailingName= title + " " + firstName.substring(0, 1) + " " + surName; 
		return mailingName;
	}
	
		
	//Print
	
	public void printLine(){
		
		System.out.println(getMailingName());
		
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
