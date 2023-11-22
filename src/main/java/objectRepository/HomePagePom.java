package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.WebDriverUtility;

public class HomePagePom extends WebDriverUtility {
	@FindBy(xpath = "//img[@src='themes/softed/images/Home.PNG']")
	private WebElement home;
	
	@FindBy(xpath = "//a[text()='Calendar']")
	private WebElement calendar;
	
	@FindBy(xpath = "(//a[text()='Leads'])[1]")
	private WebElement leads;
	@FindBy(xpath = "(//a[text()='Organizations'])[1]")
	private WebElement organisation;
	
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement contacts;
	
	@FindBy(xpath = "(//a[text()='Opportunities'])[1]")
	private WebElement oppourtunity;
	
	@FindBy(xpath = "(//a[text()='Products'])[1]")
	private WebElement products;
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement admistator;
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signout;
	
	public HomePagePom(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}

	public WebElement getHome() {
		return home;
	}

	public WebElement getCalendar() {
		return calendar;
	}

	public WebElement getLeads() {
		return leads;
	}

	public WebElement getOrganisation() {
		return organisation;
	}

	public WebElement getContacts() {
		return contacts;
	}

	public WebElement getOppourtunity() {
		return oppourtunity;
	}

	public WebElement getProducts() {
		return products;
	}

	public WebElement getAdmistator() {
		return admistator;
	}

	public WebElement getSignout() {
		return signout;
	}
	  /**
	   * Business Library for click home
	   */
		public void clickonHome() {
			getHome().click();
		}
		/**
		 * this is the business libarry for click calendar
		 */
		public void clickCalendar() {
			getCalendar().click();
		}
		/**
		 * this is the business libary for click leads
		 */
		public void clickLeads() {
			getLeads().click();
		}
		/**
		 * this is the business library for click organisation
		 */
		public void clickOrganization() {
			getOrganisation().click();
		}
		/**
		 * this is the busines library for click contacts
		 */
		public void clickContacts() {
			getContacts().click();
		}
		/**
		 * this is the business library for click opportunity
		 */
		public void clickOppourtunity() {
			getOppourtunity().click();
		}
		/**
		 * this is the busines library for click product
		 */
		public void clickProduct() {
			getProducts().click();
		}
		/**
		 * this is the business library for signout
		 */
		public void logoutOperation() {
			getAdmistator().click();
			//movingTowardsElement(driver, admistator);
			getSignout().click();
		}

	
	
	
	
	
	
}