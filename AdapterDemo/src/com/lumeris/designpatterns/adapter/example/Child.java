package com.lumeris.designpatterns.adapter.example;

public class Child extends HiveDataAdapter implements DataAccessAdapterFactory {

	public void executequery() {
		System.out.println("I am the best");
	}
}
