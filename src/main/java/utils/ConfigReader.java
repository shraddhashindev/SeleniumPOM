package utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	
	static Properties prop=new Properties();
	
	public static void readConfig() throws IOException
	{
		FileReader fr=new FileReader("D:\\Java-2025\\POMlessons\\ConfigData\\configdata.properties");
		prop.load(fr);
	}
	
	public static String getpropertyvalue(String key)
	{
		 return prop.getProperty(key);
		 
	}
	

}
