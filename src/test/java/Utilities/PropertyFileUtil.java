package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtil 
{
	public static String getValueForKey(String key) throws Throwable, Throwable
	{
		Properties configpro=new Properties();
		configpro.load(new FileInputStream(new File("./ConfigFile/Environment.properties")));
		return configpro.getProperty(key);
	
	}
}
	