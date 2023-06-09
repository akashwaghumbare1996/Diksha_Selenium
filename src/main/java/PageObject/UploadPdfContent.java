package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UploadPdfContent {
	
	@FindBy(how=How.XPATH,using="//i[@class='send icon']")
	private WebElement sendforreview;
	
	@FindBy(how=How.XPATH,using="//button[@class='ui blue button ']")
	private WebElement savebutton;

	
	@FindBy(how=How.XPATH,using="//button[text()='Close']")
	private WebElement close;
	

	@FindBy(how=How.XPATH,using="//span[text()='Save']")
	private WebElement save;
	

	@FindBy(how=How.XPATH,using="//input[@id='copyrightYear']")
	private WebElement copyright;
	

	@FindBy(how=How.XPATH,using="//input[@id='name']")
	private WebElement name;
	
	
	@FindBy(how=How.XPATH,using="//span[@class='ng-scope']")
	private WebElement editdetail;
	
	
	@FindBy(how=How.XPATH,using="//span[text()='Upload Content']")
	private WebElement uploadcontent;


	@FindBy(how=How.XPATH,using="//*[@id='_selectPrimaryCategory']")
	private WebElement contenttypetab;


	@FindBy(how=How.XPATH,using="//option[@data-value='eTextbook']")
	private WebElement eTextbook;

	
	@FindBy(how=How.XPATH,using="//*[@id='browseButton']//input")
	private WebElement browserbutton;

	

	@FindBy(how=How.XPATH,using="(//div[@class='avatar-container'])[2]")
	private WebElement headerDropdown;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Workspace')]")
	private WebElement Workspace;

	@FindBy(how=How.XPATH,using="//div[@id='url-upload']")
	private WebElement enterurl;
	
	public WebElement getSavebutton() {
		return savebutton;
	}

	public void setSavebutton(WebElement savebutton) {
		this.savebutton = savebutton;
	}

	
	public WebElement getSendforreview() {
		return sendforreview;
	}

	public void setSendforreview(WebElement sendforreview) {
		this.sendforreview = sendforreview;
	}
	
	
	public WebElement getClose() {
		return close;
	}

	public void setClose(WebElement close) {
		this.close = close;
	}

	public WebElement getUploadcontent() {
		return uploadcontent;
	}

	public void setUploadcontent(WebElement uploadcontent) {
		this.uploadcontent = uploadcontent;
	}

	public WebElement getContenttypetab() {
		return contenttypetab;
	}

	public void setContenttypetab(WebElement contenttypetab) {
		this.contenttypetab = contenttypetab;
	}

	public WebElement geteTextbook() {
		return eTextbook;
	}

	public void seteTextbook(WebElement eTextbook) {
		this.eTextbook = eTextbook;
	}

	public WebElement getBrowserbutton() {
		return browserbutton;
	}

	public void setBrowserbutton(WebElement browserbutton) {
		this.browserbutton = browserbutton;
	}

	public WebElement getHeaderDropdown() {
		return headerDropdown;
	}

	public void setHeaderDropdown(WebElement headerDropdown) {
		this.headerDropdown = headerDropdown;
	}

	public WebElement getWorkspace() {
		return Workspace;
	}

	public void setWorkspace(WebElement workspace) {
		Workspace = workspace;
	}

	public WebElement getEnterurl() {
		return enterurl;
	}

	public void setEnterurl(WebElement enterurl) {
		this.enterurl = enterurl;
	}
	public WebElement getEditdetail() {
		return editdetail;
	}

	public void setEditdetail(WebElement editdetail) {
		this.editdetail = editdetail;
	}
	public WebElement getName() {
		return name;
	}

	public void setName(WebElement name) {
		this.name = name;
	}

	public WebElement getCopyright() {
		return copyright;
	}

	public void setCopyright(WebElement copyright) {
		this.copyright = copyright;
	}
	
	public WebElement getSave() {
		return save;
	}

	public void setSave(WebElement savebutton) {
		this.save = save;
	}
}
