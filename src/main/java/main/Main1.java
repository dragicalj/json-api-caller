package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import domain.PhoneNumber;

public class Main1 {

	public static String ACCESS_KEY = "";
	public static String NUMBER = "14158586273";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		URL url;
		try {
			url = new URL("http://apilayer.net/api/validate?access_key="+ACCESS_KEY+"&number=" + NUMBER);
			
			HttpURLConnection con = (HttpURLConnection) url.openConnection();

			con.setRequestMethod("GET");
			
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

			Gson gson = new GsonBuilder().create();
			
			
			PhoneNumber phoneNumber = gson.fromJson(in, PhoneNumber.class);
			
			System.out.println(phoneNumber);
			
			in.close();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
