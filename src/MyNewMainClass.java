
class Cars{
	
		private String carName;
	
		public Cars(){
			
	    }
		
			public Cars(String carName){
			this.carName=carName;
				
	    }
		
		public void WriteLine(){
			
			System.out.println("My car is a " + carName);
			
		}
		
		public void setCarName(String carName ){
			
			this.carName= carName;
			
		}
		
		public String getCarName(){
			
			return carName;
		}
	
	
	
	
}



public class MyNewMainClass {

	public static void main(String[] args) {
		

		Cars car = new Cars("bm");
		String name = car.getCarName();
		name = name + " and it is red";
		car.setCarName(name);
	
		car.WriteLine();
		
		
		
	}

}
