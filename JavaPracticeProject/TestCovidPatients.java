package com.CovidCases;

public class TestCovidPatients {

	public static void main(String[] args) {
		
		CovidPatients objCovidPatients = new CovidPatients();
		objCovidPatients.additionOfActivePatients();
		
		
		objCovidPatients.RecoveredPatients(); 
		
		objCovidPatients.InfectedPatients();

		 
		objCovidPatients.TotalPatients();
		
		
		objCovidPatients.additionOfActivePatients(20, 40);
		objCovidPatients.additionOfActivePatients(50, 40);
	}

}
