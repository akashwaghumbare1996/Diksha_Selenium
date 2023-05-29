package folder;

import static org.testng.Assert.assertEquals;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Test;

import PageObject.BMCPopup;
import PageObject.CreateBook;
import PageObject.ExplorePage;
import PageObject.LocationPopup;
import PageObject.LoginAsCustodian;
import PageObject.LoginPage;
import PageObject.Logout;
import PageObject.OtherProfile;
import PageObject.ParentProfile;
import PageObject.SchoolHeadProfile;
import PageObject.StudentProfile;
import PageObject.TeacherProfile;
import Utility.BaseClass;
import Utility.Library;

public  class UserOnBoarding extends BaseClass {
	static ExtentTest test;
	
	public static void studenticon() throws Exception   {
		
	
		
		StudentProfile student=PageFactory.initElements(driver, StudentProfile.class);
		Library.custom_click(student.getStudentIcon(), "student");
	//	student.getStudentIcon().click();
		Thread.sleep(1000);
		Library.custom_click(student.getContinueButton(),"continuebutton");
	//	student.getContinueButton().click();
		Thread.sleep(1000);	
		
	
  }

	public static void teachericon()  {
		
		 try {
				
				TeacherProfile teacher=PageFactory.initElements(driver, TeacherProfile.class);
				Library.custom_click(teacher.getTeacher(),"teacher");
				Thread.sleep(1000);
				Library.custom_click(teacher.getContinueButton(),"continuebutton");
			//	teacher.getContinueButton().click();
				Thread.sleep(1000);
				
			}catch(Exception e) {
				
				System.out.println(e.getMessage());
			}
		}
			
			public static void othericon()  {
				
			try {
				
				OtherProfile other=PageFactory.initElements(driver , OtherProfile.class );
				Library.custom_click(other.getOther(),"other");
				Thread.sleep(1000);
				Library.custom_click(other.getContinueButton(),"continuebutton");
			//  other.getContinueButton().click();
				Thread.sleep(1000);
				
				}catch(Exception e)	{
					
					System.out.println(e.getMessage());
				}

		}
			
		    public static void parenticon() throws Exception  {
				
		  
		    	
			    ParentProfile parent=PageFactory.initElements(driver , ParentProfile.class );
			    Library.custom_click(parent.getParent(),"parent");
			    Thread.sleep(1000);
			    Library.custom_click(parent.getContinueButton(),"continuebutton");
		   //   parent.getContinueButton().click();
			    Thread.sleep(1000);
		   
		   
		}
		    
		   public static void schoolheadicon() throws Exception  {
			
		 
			
			   SchoolHeadProfile schoolhead=PageFactory.initElements(driver , SchoolHeadProfile.class );
			   BMCPopup bmcpopup=PageFactory.initElements(driver, BMCPopup.class);
			   
			   Library.custom_click(schoolhead.getSchoolhead(),"SchoolHead");
			   Thread.sleep(1000);
			   Library.custom_click(schoolhead.getContinueButton(),"continuebutton");
			// schoolhead.getContinueButton().click();
			   Thread.sleep(1000);
			   
			 
//			 if ( (bmcpopup.getBoard().isDisplayed())) {
//				 
//				 System.out.println("passed");
//			 }else{
//				 
//				 System.out.println("failed");
//			 }
		
			 //  Assert.assertTrue(bmcpopup.getBoard().isDisplayed(),"successfully clicked on SchoolHeadProfile Continue Button ");
			 
			   Library.assert_Is_Displayed(bmcpopup.getBoard(), "SchoolHeadProfile Continue Button");
			   
		}
		    

			public static void bmcpopuphandle() throws Throwable  {
				
				
				
				BMCPopup bmcpopup=PageFactory.initElements(driver, BMCPopup.class);
				LocationPopup locationpopup=PageFactory.initElements(driver, LocationPopup.class);
				
				Library.custom_click(bmcpopup.getBoard(),"board");
				Library.custom_click(bmcpopup.getCbsc(),"cbsc");
				Thread.sleep(4000);
				
				Library.custom_click(bmcpopup.getMedium(),"medium");
				Library.custom_click(bmcpopup.getEnglish(),"english");
				Thread.sleep(1000);
				
				 Actions act=new Actions(driver);
				 act.moveByOffset(50, 100).click().build().perform();
				 Thread.sleep(1000);
				 
				Library.custom_click(bmcpopup.getClasss(),"classs");
				Library.custom_click(bmcpopup.getClass2(),"class2");
				act.moveByOffset(50, 100).click().build().perform();
				Thread.sleep(1000);
				Library.custom_click(bmcpopup.getBMCSubmit(),"bmcsubmit");
				bmcpopup.getBMCSubmit().click();
			    Thread.sleep(2000);
				
			    
			//	Assert.assertTrue(locationpopup.getName().isDisplayed());
			//	Thread.sleep(1000);
			
//			    if ( (locationpopup.getName().isDisplayed())) {
//					 
//					 System.out.println("passed12");
//				 }else{
//					 
//					 System.out.println("failed");
//				 }
		//	  Assert.assertTrue(locationpopup.getName().isDisplayed(),"successfully clicked on BMCPopup Submit Button ");
		          		
				Library.assert_Is_Displayed(locationpopup.getName(), "BMCPopup  submit button");			
		}
			
			public static void locationpopuphandle() throws Exception {
				
				
				
				LocationPopup locationpopup=PageFactory.initElements(driver, LocationPopup.class);
				
				Library.custom_click(locationpopup.getState(),"state");
				Thread.sleep(1000);
				Library.custom_click(locationpopup.getMaharashtraState(),"Maharashtra");
				Thread.sleep(1000);
				Library.custom_click(locationpopup.getDistrict(),"district");
				Thread.sleep(1000);
				Library.custom_click(locationpopup.getAkolaDistrict(),"Akola");
				Thread.sleep(1000);
				Library.custom_click(locationpopup.getSubmitButton(),"submitbutton");
				Thread.sleep(1000);
				locationpopup.getSubmitButton().isSelected();
				Thread.sleep(1000);
				
		//	Assert.assertTrue(locationpopup.getguestprofile().isDisplayed());
		//	boolean isElementDisplayed =locationpopup.getguestprofile().isDisplayed();
//				
//				String actualValue=locationpopup.getguestprofile().getText();
//				System.out.println(actualValue);
//				String expectedValue = "G";
//				
//				if (expectedValue.equals(actualValue)) {
//				    System.out.println("Pass");
//				} else {
//				    System.out.println("Failed");
//				}
		//	Assert.assertTrue(locationpopup.getguestprofile().isDisplayed(),"successfully clicked on LocationPopup Submit Button ");
          
			//  Library.assert_Is_Displayed(locationpopup.getguestprofile(), " Locationpopup submit button");		
		}
			
			public static void loginascreator() throws Throwable  {
			
			
				UserOnBoarding.studenticon();;
				UserOnBoarding.bmcpopuphandle();
				UserOnBoarding.locationpopuphandle();
				
				LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
				Logout    logout=PageFactory.initElements(driver, Logout.class);
				
		        Library.custom_click(loginpage.getHeaderDropdown(),"headerdropdown");
				Thread.sleep(1000);
				Library.custom_click(loginpage.getLogintab(),"logintab");
				Thread.sleep(1000);
				Library.custom_sendkeys(loginpage.getUserName(),excel.getExcelData("Credentials", 1, 1),"username");
				Thread.sleep(1000);
				Library.custom_sendkeys(loginpage.getPassword(), excel.getExcelData("Credentials", 1, 2),"password");
			    Thread.sleep(1000);
				Library.custom_click(loginpage.getLogin(),"login");
				Thread.sleep(1000);
				
					
					
			}
			
		public static void loginasreviewer() {
				
			try {
				ExplorePage explore=PageFactory.initElements(driver,  ExplorePage.class);
				LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
				
				Thread.sleep(1000);
			    explore.getExplorebutton().click();
			    Thread.sleep(1000);
			
		        Library.custom_click(loginpage.getHeaderDropdown(),"headerdropdown");
				Thread.sleep(1000);
				Library.custom_click(loginpage.getLogintab(),"logintab");
				Thread.sleep(1000);
				Library.custom_sendkeys(loginpage.getUserName(),excel.getExcelData("Credentials", 2, 1),"username");
			    Thread.sleep(1000);
				Library.custom_sendkeys(loginpage.getPassword(), excel.getExcelData("Credentials", 2, 2 ),"password");
		        Thread.sleep(1000);
				Library.custom_click(loginpage.getLogin(),"login");
				Thread.sleep(1000);
			
			}catch(Exception e){
				
				System.out.println(e.getMessage());
			}
		}
			

		public static void createBook() {
			
			try {
			
			CreateBook createbook=PageFactory.initElements(driver,CreateBook.class);
			
			Library.custom_click(createbook.getHeaderDropdown(),"headerdropdown");
			Thread.sleep(1000);
			Library.custom_click(createbook.getWorkspace(),"workspace");
			Thread.sleep(4000);
		//  createbook.getBook().click();
		    Library.custom_click(createbook.getBook(),"book");
			Thread.sleep(4000);
			
			String randomname=RandomStringUtils.randomAlphabetic(10);
			Library.custom_sendkeys(createbook.getBookname(), randomname,"bookname");
//			createbook.getBookname().sendKeys(randomname);
			Thread.sleep(4000);
			Library.custom_click(createbook.getStartCreating(),"startcreating");
			Thread.sleep(1000);
			
			}catch(Exception e) {
				
				System.out.println(e.getMessage());
			}
			
			
			
			
		}
		
		public static void logout_As_Creator()   {
			
			try {
			Logout log= PageFactory.initElements(driver, Logout.class);	
			Library.custom_click(log.getDigitaltextbooktab(),"Digital textbook tab");	
			Thread.sleep(1000);
			Library.custom_click(log.getCreatorIcon(),"c icon");
			Thread.sleep(1000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true);",log.getLogout());
			Library.custom_click(log.getLogout(),"logout");
				
			}catch(Exception e) {
			
				System.out.println(e.getMessage());
			  }
		  }
		
	public static void logout_As_Reviewer()   {
			
			try {
			Logout log= PageFactory.initElements(driver, Logout.class);	
			Library.custom_click(log.getDigitaltextbooktab(),"Digital textbook tab");	
			Thread.sleep(1000);
			Library.custom_click(log.getCreatorIcon(),"c icon");
			Thread.sleep(1000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true);",log.getLogout());
			Library.custom_click(log.getLogout(),"logout");
				
			}catch(Exception e) {
			
				System.out.println(e.getMessage());
			  }
		  }
	
	public static void loginasCustodian() {
		
		try {
			ExplorePage explore=PageFactory.initElements(driver,  ExplorePage.class);
		    explore.getExplorebutton().click();
		    LoginAsCustodian Log=PageFactory.initElements(driver, LoginAsCustodian.class);
			Library.custom_click(Log.getHeaderDropdown(), "HeaderDropdown");
			Thread.sleep(1000);
			Library.custom_click(Log.getLogintab(),"Logintab");
			Thread.sleep(1000);
			Library.custom_sendkeys(Log.getUserName(),excel.getExcelData("Credentials", 5,1 ), "username");
			Library.custom_sendkeys(Log.getPassword(),excel.getExcelData("Credentials", 5,2 ), "Password");
			Library.custom_click(Log.getLogin(),"login button");
			
		}catch(Exception e){
			
			System.out.println(e.getMessage());
		}
	}
	
	public static void reLoginAsCreator() throws InterruptedException  {
		
		try {
			ExplorePage explore=PageFactory.initElements(driver,  ExplorePage.class);
		    explore.getExplorebutton().click();
			LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
			
	        Library.custom_click(loginpage.getHeaderDropdown(),"headerdropdown");
			Thread.sleep(1000);
			Library.custom_click(loginpage.getLogintab(),"logintab");
			Thread.sleep(1000);
			Library.custom_sendkeys(loginpage.getUserName(),excel.getExcelData("Credentials", 1, 1),"username");
			Thread.sleep(1000);
			Library.custom_sendkeys(loginpage.getPassword(), excel.getExcelData("Credentials", 1, 2),"password");
		    Thread.sleep(1000);
			Library.custom_click(loginpage.getLogin(),"login");
			Thread.sleep(1000);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
				
				
		}
	
	
		}


