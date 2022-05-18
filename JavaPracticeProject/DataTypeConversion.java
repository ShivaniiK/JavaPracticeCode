package com.DataTypeConversion;

public class DataTypeConversion {
	public void candidatesAge(String strAge) //verifying age 
	
	{
		int intAge=18;
		int intConvertedAge = Integer.parseInt(strAge);
		
		if(intConvertedAge > intAge) 
		{
			System.out.println("Candidate is Eligible");
		}
		else 
		{
			System.out.println("Candidate is not Eligible");
		}

	}

	    public void verifyStringEquality(int intAge) //verifying equality
	    {
	    	String strAge = "25";
	    	String strConvertAge = String.valueOf(intAge);
	    	
	    	if(strAge.equals(strConvertAge)) {
	    		System.out.println("Both are Same");
	    	} else {
	    		System.out.println("Both are different");
	    		
	    	}
	    }
	    
	     public void verifyWeight(String strWeight) //string to double
	     {
	    	 Double Ddouble = 55.25;
	    	 double DWeight = Double.parseDouble(strWeight);
	    	 
	    	 if(DWeight > Ddouble)
	    	 {
	    			System.out.println("Weight is OK");
	    		}
	    	  else 
	    	 {
	    		System.out.println("Weight is not OK");
	    	}
	     }
	     
	     public void floatConversion(Float fltnum) //Float to string
	     {
	    	 float fnum = 45.7f;
	    	 String snum = Float.toString(fltnum);
	    	 System.out.println("Converted Number is:"+snum);
	     }
	     
         
         public void stringToChar() //StringToChar
         {
        	 String stringExample = "India";
        	 char characters = stringExample.charAt(0);
        	 
        	 if(characters == 'I')
        	 {
        		 System.out.println("Conversion is Successful");
        	 }
        		 else 
    	    	 {
    	    		System.out.println("Conversion is UnSuccessful");
    	    	}
    	     }
}
      