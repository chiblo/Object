
public class MainCustomer {

	public static void main(String[] args) {
		
		NewCustomer simon = new NewCustomer("Mr", "Simon", "Pieman", "Bigway 4" , "00000000" , "simon@gj.jk" , 123 , GenderType.MALE);
		
		
		GenderType printSimon= simon.getGender();		
		
		if (printSimon== GenderType.MALE) {
			
			System.out.println("He is asad sd asd asd ads dasd  male");
		}
		
		
		
		
		
	//	System.out.println(printSimon);
		
	//	simon.printLine();
		
		
		
		

		
	}

}
