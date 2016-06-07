package com.lumeris.designpatterns.adapter.example;

public class MySQLDataAdapter implements DataAccessAdapterFactory{

	@Override
	public void executequery() {
		System.out.println("Executing MySql query");
		
	}

}
