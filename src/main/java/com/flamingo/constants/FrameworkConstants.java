package com.flamingo.constants;

public final class FrameworkConstants {
	
	private FrameworkConstants(){}
	
	private static final String propertiesfilepath=System.getProperty("user.dir")+
			"/src/main/resources/configuration.properties";

	public static  String getpropertiesfilepath() {
		return propertiesfilepath;
	}

}
