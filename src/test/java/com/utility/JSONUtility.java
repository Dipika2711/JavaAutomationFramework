package com.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.constant.Env;
import com.google.gson.Gson;
import com.ui.pojo.Config;
import com.ui.pojo.Environmnet;
public  class JSONUtility{
	
	
	
//GSON is an 3rd party library added in pom. xml file hence we can create object of that file
	
	public static Environmnet readJson(Env env) {
		
	
	Gson gson = new Gson();
	
	File jsonfile= new File(System.getProperty("user.dir")+"\\config\\config.json");
	FileReader fileReader= null;
	try {	
		fileReader = new FileReader(jsonfile);
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}

	Config config = gson.fromJson(fileReader, Config.class);
	Environmnet environment = config.getEnvironments().get("QA");
	return environment;
	
	
	
	

	

}
