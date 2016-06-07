package com.lumeris.designpatterns.adapter.example;

public class HiveDataAdapter implements DataAccessAdapterFactory{

	@Override
	public void executequery() {
		System.out.println("Executing Hive query");
		
	}

}
