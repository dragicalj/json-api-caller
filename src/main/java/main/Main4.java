package main;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import domain.PhoneNumber;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneNumber phoneNumber=new PhoneNumber("14158586273", "4158586273", "+14158586273", "+1", "US", "United States of America", "Novato", "AT&T Mobility LLC", "AT&T Mobility LLC");

		JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("number",phoneNumber.getNumber());
        jsonObject.addProperty("local_format",phoneNumber.getLocalFormat());
        jsonObject.addProperty("international_format",phoneNumber.getInternationalFormat());
        jsonObject.addProperty("country_prefix",phoneNumber.getCountryPrefix());
        jsonObject.addProperty("country_code",phoneNumber.getCountryCode());
        jsonObject.addProperty("country_name",phoneNumber.getCountryName());
        jsonObject.addProperty("location",phoneNumber.getLocation());
        jsonObject.addProperty("carrier",phoneNumber.getCarrier());
        jsonObject.addProperty("line_type",phoneNumber.getLineType());
        
        try(PrintWriter out = new PrintWriter(new FileWriter("rucni_upis.json"))){
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			
			out.print(gson.toJson(jsonObject));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
