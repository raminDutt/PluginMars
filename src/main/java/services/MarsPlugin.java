package services;

import framework.IPlugin;


public class MarsPlugin implements IPlugin {

	public MarsPlugin() {
		System.out.println("Default Constructor for "
				+ this.getClass().getCanonicalName());
	}

	@Override
	public String getName() {
		String result = "MarsPlugin";
		return result;
	}

}
