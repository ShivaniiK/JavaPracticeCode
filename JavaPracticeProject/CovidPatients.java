package com.CovidCases;

public class CovidPatients {
	
	int intToalCasesInIndia = 1000; //global variable 
	int intTotalCasesInMaharashtra = 400, intTotal=0;
	
	public void additionOfActivePatients() {
		int intKop = 80;
		int intSangli = 50;
		int intTotalNumber = intKop + intSangli;
		System.out.println("Addition of Active Patients in Kop and Sangli = "+intTotalNumber);
		
		}
	
	public void recoveredPatients() {
	  int intPune = 120;
	  int intMumbai = 150;
	  int TotalResult = intPune + intMumbai;
	  System.out.println("Total Recovered Patients in Pune & Mumbai are: "+TotalResult);
	  
	}
		
	public void infectedPatients() {
		int Infected = 200;
		int Recovered = 100;
		int TotalInfected = Infected - Recovered;
		System.out.println("Total Infected Patients are:"+TotalInfected);
		
	}
		
	 public void totalPatients() {
		 intTotal = intToalCasesInIndia + intTotalCasesInMaharashtra;
		 System.out.println("TotalPatients ="+intTotal);
	 }
	 
	 
	 public void additionOfActivePatients(int intKop,int intSangli) {
	 int intTotalNumber = intKop + intSangli;
	 System.out.println("Addition of Active Patients in Kop and Sangli = "+intTotalNumber);
		 
	 }
}
