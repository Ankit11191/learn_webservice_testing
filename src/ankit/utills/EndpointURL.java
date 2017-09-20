package ankit.utills;

public enum EndpointURL 
{
	showMyIP("/callback=showMyIP"),
	countryNameJson("/PCW45-12345-12345-1234X/country?format=json"),
	countryNameXml("/PCW45-12345-12345-1234X/country?format=xml");
	String Rpath;

	EndpointURL(String rpath)
	{
		this.Rpath=rpath;
	}
	
	public String getRpath()
	{
		return this.Rpath;
	}
}

