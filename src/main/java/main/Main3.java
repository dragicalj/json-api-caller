package main;

import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import domain.PhoneNumber;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileReader in = new FileReader("niz_objekata.json")){
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			
			//Movie[] movies = gson.fromJson(in, Movie[].class);
			List<PhoneNumber> phoneNumbers = Arrays.asList(gson.fromJson(in, PhoneNumber[].class));
			
			for(PhoneNumber ph: phoneNumbers)
				System.out.println(ph);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
