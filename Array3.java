class Array3{
	public static void main(String [] args){
		int ar[]={1500,6000,3500,2500};
		int min=ar[0];
		for(int i=0;i<ar.length;i++){
			if(ar[i]<min){
				min=ar[i];
			}
		}
		System.out.println("MIN : "+min);
		
	}
}