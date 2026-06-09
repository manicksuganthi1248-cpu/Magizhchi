class Array2{
	public static void main(String [] args){
		int ar[]={1500,6000,3500,2500};
		int max=0;
		for(int i=0;i<ar.length;i++){
			if(ar[i]>max){
				max=ar[i];
			}
		}
		System.out.println("MAX : "+max);
		
	}
}