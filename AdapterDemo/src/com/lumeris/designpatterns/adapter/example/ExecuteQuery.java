package com.lumeris.designpatterns.adapter.example;

public class ExecuteQuery {

	public static void main(String[] args) {
		System.out.println("Let's execute queries for each query type");
		
		HiveDataAdapter hiveDataAdapter = new HiveDataAdapter();
		MySQLDataAdapter mySQLDataAdapter = new MySQLDataAdapter();
		AdapterPlug phoenixadapter = new AdapterPlug("phoenix");

		
		hiveDataAdapter.executequery();
		mySQLDataAdapter.executequery();
		phoenixadapter.executequery();

		
		
		

	}

}
