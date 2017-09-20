package ankit.testScripts;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class XmlToJson {

	public static String convert(String xml) {
		String jsonString = null;
		try {
		            JSONObject xmlJSONObj = XML.toJSONObject(xml);
		            jsonString = xmlJSONObj.toString(3);
		     } catch (JSONException je) {
		            System.out.println(je.toString());
		        }
		return jsonString;
		    }
}
