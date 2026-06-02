class ConditionalStat{
	public static void main (String [] args){
		System.out.println("*******IF STATEMENT*******");
		int age = 18;
		System.out.println("AGE : "+age);
		if(age>=18){
			System.out.println("Eliglible to vote");
		}
		System.out.println("*******IF ELSE STATEMENT*******");
		int agem = 10;
		System.out.println("AGE : "+agem);
		if(agem>=18){
			System.out.println("ALLOW TO WATCH MOVIE");
		}
		else{
			System.out.println("NOT ALLOWED TO WATCH A RATED MOVIE");
		}
		System.out.println("*******IF ELSE IF LADDER STATEMENT*******");
		char signal = 'R';
		System.out.println("SIGNAL : "+signal);
		if(signal=='G'){
			System.out.println("MOVE");
		}
		else if(signal=='Y'){
			System.out.println("READY");
		}
		else if(signal=='R'){
			System.out.println("STOP");
		}	
		System.out.println("*******NESTED IF STATEMENT*******");
		char gender = 'M';
		int experience = 2;
		System.out.println("GENDER : "+gender);
		System.out.println("EXPERIENCE : "+experience);
		if(gender=='M'){
			if(experience>0){
				System.out.println("YOU ARE SELECTED");
			}
			else{
				System.out.println("YOU ARE NOT SELECTED");
			}
		}
	}
}	
				
			
			
		
		
			