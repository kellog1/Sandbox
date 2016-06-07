package com.lumeris.designpatterns.adapter.example;

public class AdapterPlug implements DataAccessAdapterFactory {

	PhoenixDataAdapter phoenixDataAdapter;

	public AdapterPlug(String querytype) {
		if (querytype.equalsIgnoreCase("phoenix")) {
			phoenixDataAdapter = new PhoenixDataAdapter();

		}
	}

	@Override
	public void executequery() {
		phoenixDataAdapter.executequeryPhoenix();

	}

}
