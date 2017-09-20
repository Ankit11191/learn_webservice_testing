package ankit.utills;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UrlFixed 
{	
	public static Properties restURL() throws FileNotFoundException, IOException
	{
		File file=new File("URL.txt");
		FileInputStream fileInputStream=new FileInputStream(file);
		Properties properties=new Properties();
		properties.load(fileInputStream);
		fileInputStream.close();		
		return properties;	
	}	
}
