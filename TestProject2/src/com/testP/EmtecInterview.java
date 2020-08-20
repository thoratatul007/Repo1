package com.testP;

public class EmtecInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i=1;
		
		@SuppressWarnings("unused")
		int count =0;
		while(i<=15)
		{
			
			if((i%5==0)&&(i%3==0))
			{
				
				//System.out.println("Divided Numbers=="+i);
				System.out.println(i);
				//count++;
			}
			
			
			
			  else if((i%5!=0)&&(i%5!=0)) {
			  System.out.println("Number is not Divisible By both="+i);
			  
			  }
			
			
			i++;
		}
		
		
		
		

	}

}
