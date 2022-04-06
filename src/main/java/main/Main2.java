package main;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import domain.PhoneNumber;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneNumber phoneNumber1=new PhoneNumber("12122226673", "4158586273", "+14158586273", "+1", "US", "United States of America", "Novato", "AT&T Mobility LLC", "AT&T Mobility LLC");
		PhoneNumber phoneNumber2=new PhoneNumber("14158586273", "4158586273", "+14158586273", "+1", "US", "United States of America", "Novato", "AT&T Mobility LLC", "AT&T Mobility LLC");
		PhoneNumber phoneNumber3=new PhoneNumber("12668222315", "4158586273", "+14158586273", "+1", "US", "United States of America", "Novato", "AT&T Mobility LLC", "AT&T Mobility LLC");
		
		PhoneNumber[] phoneNumbers= {phoneNumber1,phoneNumber2,phoneNumber3};
		
		try(PrintWriter out = new PrintWriter(new FileWriter("niz_objekata.json"))){
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			
			out.print(gson.toJson(phoneNumbers));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
