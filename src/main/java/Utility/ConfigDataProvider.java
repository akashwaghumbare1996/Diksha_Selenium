package Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

	Properties pro;
	
	public ConfigDataProvider() throws Exception {
		
	String path = System.getProperty("user.dir")+"\\Config\\Config.Properties";	
	
	FileInputStream fis =new  FileInputStream (path);
		 pro=new Properties();
		pro.load(fis);
		
		
	}
	
	public String get_app_url() {
		
		return pro.getProperty("app_url");
			
	}
	
	public  String get_test_data() {
		
		return pro.getProperty("test_data");
		
	}
	
	public String get_short_pdf() {
		
		return pro.getProperty("short_pdf");
	}
	
       public String get_long_pdf() {
		
		return pro.getProperty("long_pdf");
	}
     
       public String get_mp4() {
   		
   		return pro.getProperty("mp4");
   	}
   	
          public String get_h5p() {
   		
   		return pro.getProperty("h5p");
   	}
       
          public String get_epub() {
         		
         		return pro.getProperty("epub");
      	}
             
             
       
       
	
}
