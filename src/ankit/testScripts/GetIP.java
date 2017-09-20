package ankit.testScripts;


import java.io.FileNotFoundException;
import java.io.IOException;

import ankit.utills.EndpointURL;
import ankit.utills.UrlFixed;
import ankit.utills.PojoClass;
import ankit.webservices.methods.webservices;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import io.restassured.response.Response;

public class GetIP 
{
	public static void main(String[] arg) throws FileNotFoundException, IOException
	{
		Gson gson=new GsonBuilder().create();
		PojoClass pojoClass;
		
		String url=UrlFixed.restURL().getProperty("URL2")+EndpointURL.countryNameXml.getRpath();
		
		System.out.println(url);
		Response response=webservices.get(url);
		
		if(response.getStatusCode()==200)
		{
			System.out.println(response.getStatusCode());
			String reader= response.getBody().asString();
			System.out.println(reader);

			pojoClass = gson.fromJson(reader, PojoClass.class);
				System.out.println(pojoClass.getIp());
			}
		}
	}
