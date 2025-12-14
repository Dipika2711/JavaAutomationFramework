package com.utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class LoggerUtility {
	
	//global configuration for logger
	
   
   //logger will have constructor as private and you cannot create object outside the class
   
   private LoggerUtility() {
	   
	   
   }
   
   public static org.apache.logging.log4j.Logger getLogger(Class<?>clazz) {
	   org.apache.logging.log4j.Logger logger =null;
	   if(logger==null) {
	   logger=LogManager.getLogger(clazz);
	   }
	   return logger;
	   
	   
	   
	   
   }
	
	
	

}
