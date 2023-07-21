package appUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility {
	
	//------------------Method To Fetch Property Value from config.properties file---------------------------	
			public static Object fetchPropertyValue(String Key) throws IOException 
			{		
				//Connection with configuration file	
				FileInputStream file = new FileInputStream("./Configurations/config.properties");
				Properties property = new Properties();
				property.load(file);
				
				//Which Data we want to read
				return property.get(Key);			
			}
}
