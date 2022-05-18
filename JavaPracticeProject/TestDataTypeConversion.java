package com.DataTypeConversion;

public class TestDataTypeConversion {

	public static void main(String[] args) 
		{
			DataTypeConversion objDataTypeConversion = new DataTypeConversion();
			objDataTypeConversion.candidatesAge("12");
			objDataTypeConversion.candidatesAge("19");
			
			objDataTypeConversion.verifyStringEquality(25);
			objDataTypeConversion.verifyStringEquality(30);
			
			objDataTypeConversion.verifyWeight("60.25");
			objDataTypeConversion.verifyWeight("54.50");
			
			objDataTypeConversion.floatConversion(45.7f);
			objDataTypeConversion.floatConversion(54.8f);
			
			objDataTypeConversion.stringToChar();
			
			
		}

	}

