class Array1{
	public static void main(String [] args){
		int ar[]=new int [4];
		ar[0]=30;
		ar[1]=35;
        ar[2]=40;
        ar[3]=45;
        
		
		int sum=0;
		for(int i=0;i<ar.length;i++){
			sum+=ar[i];
		}
		System.out.println("SUM : "+sum);
	}
}	
		
		
		