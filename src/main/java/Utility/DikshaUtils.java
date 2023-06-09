package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
public class DikshaUtils extends BaseClass {

	public static String generate_Do_id() {
		
		
		String currentUrl = driver.getCurrentUrl(); 
        String do_id ="do_";
        
        int startIndex = currentUrl.indexOf(do_id);
        String parsedString = currentUrl.substring(startIndex);
     
        String end_id ="/";
        int endIndex = parsedString.indexOf(end_id);
        
        endIndex =startIndex+endIndex;
        
        String  DO_ID=currentUrl.substring(startIndex, endIndex);
        
        return DO_ID;
		
	}

	public static String set_Content_Name(String type){
		
	String content_name=type+RandomStringUtils.randomAlphabetic(6);
		
		return content_name;
	}
	
	public static void pdf_page_Count() {
		
		String short_pdf=config.get_short_pdf();
	//	String pdfFilePath = "System.getProperty(\"user.dir\")+\"\\src\\main\\resources\\pdf_13.pdf\")";
		
		String pdfFilePath = System.getProperty("user.dir")+short_pdf;
        try {
            // Load the PDF document
            PDDocument document = PDDocument.load(new File(pdfFilePath));
            
            // Get the number of pages in the PDF
            int pageCount = document.getNumberOfPages();
            
            // Print the number of pages
            System.out.println("Number of Pages: " + pageCount);
            
        
        } catch (IOException e) {
            e.printStackTrace();
        }
    
}

}





	
	
	

