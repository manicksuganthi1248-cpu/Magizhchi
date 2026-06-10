class Array2DLarge{
	public static void main(String [] args){
		
		int ar[][]={
			{1,8,3},
			{4,2,6},};
	    int LargeNo=0;
	    for(int i=0;i<ar.length;i++){
	    	for(int j=0;j<ar[i].length;j++){
	    		if(ar[i][j]>LargeNo){
					LargeNo=ar[i][j];
				}
		    }
        }
		System.out.println("LARGE : "+LargeNo);
	}
}	