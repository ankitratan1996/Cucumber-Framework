
package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.flamingo.constants.FrameworkConstants;


public final class PropertyFileHandler {

	private PropertyFileHandler() {
	}

	private static Properties prop = null;

	public static String getPropertyValue(String key) {
		prop = new Properties();
		try {
			FileInputStream fis =new FileInputStream(FrameworkConstants.getpropertiesfilepath());
			try {
				prop.load(fis);
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
	
			e.printStackTrace();
		}
		
		return prop.getProperty(key);
	}

}
