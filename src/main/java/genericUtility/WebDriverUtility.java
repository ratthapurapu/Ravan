package genericUtility;

import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;
/**
 * This class is all about webDriver related things
 */
public class WebDriverUtility {
	/**
	 * This method is used to maximize the window
	 * @param driver
	 */
   public void maximizeWindow(WebDriver driver) {
	   driver.manage().window().maximize();
	   }
   /**
    * This method is used to perform implicit wait operation
    * @param driver
    */
   public void implicitWaitinScript(WebDriver driver) {
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   }
   /**
    * This method is use to wait for a particular webelement
    * @param driver
    * @param element
    */
   public void explicitWaitforAnElement(WebDriver driver,WebElement element) {
	   WebDriverWait wait=new  WebDriverWait(driver, Duration.ofSeconds(10));
	   wait.until(ExpectedConditions.visibilityOf(element));
	   
   }
   /**
    * this method is create to wait to perform click operation on a particualar Webelement
    * @param driver
    * @param element
    */
   public void explicitWaitToclickAnElement(WebDriver driver,WebElement element) {
	   WebDriverWait wait=new  WebDriverWait(driver, Duration.ofSeconds(10));
	   wait.until(ExpectedConditions.elementToBeClickable(element));
   }
   
                            // DropDown handling methods
   /**
    * This method is use to select an option by indexvalue
    * @param element
    * @param indexvalue
    */
   public void selectOption(WebElement element ,int indexvalue) {
	   Select s=new Select(element);
	   s.selectByIndex(indexvalue);
   }
   /**
    * This method is use to select an option by  string value
    * @param element
    * @param value
    */
   public void selectOption(WebElement element, String value) {
	   Select s=new Select(element);
	   s.selectByValue(value);
   }
   /**
    * this method is use to select an option by visible text
    * @param element
    * @param visibleText
    */
   public void selectOptionByVisibleText(WebElement element ,String visibleText) {
	   Select s=new Select(element);
	   s.selectByVisibleText(visibleText);
   }
   /**
    * this method is use to de-select all the option from a dropdown
    * @param element
    */
    
   public void deselectByAll(WebElement element) {
	   Select s=new Select(element);
	   s.deselectAll();
   }
   /**
    * This method is use to de-select an option by indexvalue
    * @param element
    * @param indexvalue
    */
   public void deselectOption(WebElement element ,int indexvalue) {
	   Select s=new Select(element);
	   s.deselectByIndex(indexvalue);
   }
   /**
    * This method is use to de-select an option by  string value
    * @param element
    * @param value
    */
   public void deselectOption(WebElement element, String value) {
	   Select s=new Select(element);
	   s.deselectByValue(value);
   }
   /**
    * this method is use to de-select an option by visible text
    * @param element
    * @param visibleText
    */
   public void deselectOptionByVisibleText(WebElement element ,String visibleText) {
	   Select s=new Select(element);
	   s.deselectByVisibleText(visibleText);
   }
   /**
    * this method is use to cross check dropdown is multiselected or not
    * @param element
    */
   public void checkDropdownmultiselected(WebElement element) {
	   Select s=new Select(element);
	   s.isMultiple();
   }
   //Mouse action handling methods
   /**
    * This method is use to a particular element
    * @param driver
    * @param element
    */
   public void movingTowardsElement(WebDriver driver,WebElement element) {
	   Actions act=new Actions(driver);
	   act.moveToElement(element).perform();
   }
   /**
    * This method is used to perform right click operation
    * @param driver
    */
   public void rightClickOperation(WebDriver driver) {
	   Actions act=new Actions(driver);
	   act.contextClick().perform();
   }
   /**
    * This methods used to perform right click opeartion on a particular element
    * @param driver
    * @param element
    */
   public void rightClickOperation(WebDriver driver,WebElement element) {
	   Actions act=new Actions(driver);
	   act.contextClick(element).perform();
   }
   /**
    * This method is used to perform click operation
    * @param driver
    */
   public void clickOperation(WebDriver driver) {
	   Actions act=new Actions(driver);
	   act.click().perform();
	   }
   /**
    * this method is used to perform click operation on a particular webelement 
    * @param driver
    * @param element
    */
   public void clickOperation(WebDriver driver,WebElement element) {
	   Actions act=new Actions(driver);
	   act.click(element).perform();
	   }
   /**
    * this method is used to perform double click operation
    * @param driver
    */
   public void doubleClickOperation(WebDriver driver) {
	   Actions act=new Actions(driver);
	   act.doubleClick().perform();
   }
   /**
    * this method is used to perform double click operation on a particular element
    * @param driver
    * @param element
    */
   public void doubleClickOperation(WebDriver driver,WebElement element) {
	   Actions act=new Actions(driver);
	   act.doubleClick(element).perform();
   }
   /**
    * this method is used to perform drag and drop operation
    * @param driver
    * @param src
    * @param target
    */
   public void dragAndDropOperation(WebDriver driver,WebElement src,WebElement target) {
	   Actions act=new Actions(driver);
	   act.dragAndDrop(src, target).perform();
   }
   /**
    * This method is use to handle sliders
    * @param driver
    * @param src
    * @param x
    * @param y
    */
   public void dragAndDropSlider(WebDriver driver,WebElement src,int x,int y) {
	   Actions act=new Actions(driver);
	   act.dragAndDropBy(src, x, y).perform();
   }
   /**
    * this method is use to perform scrolldown operation
    * @param driver
    * @param element
    */
   public void scrollDownOperation(WebDriver driver,WebElement element) {
	   Actions act=new Actions(driver);
	   act.scrollToElement(element).perform();
   }
      //Alert popup handle methods
   /**
    * this method is use to accept the alert popoup
    * @param driver
    */
   public void acceptAlert(WebDriver driver) {
	   driver.switchTo().alert().accept();
   }
   /**
    * this method is use to dismiss the the alert popoup
    * @param driver
    */
   
   public void dismissAlert(WebDriver driver) {
	   driver.switchTo().alert().dismiss();
   }
   /**
    * this method is created to fetch the alert popup message
    * @param driver
    */
   public void fetchAlertMessage(WebDriver driver) {
	   driver.switchTo().alert().getText();
	   
   }
   //Frame popup methods
   /**
    * this method is used to switch the frame based on the index
    * @param driver
    * @param index
    */
   public void switchToFrameByIndex(WebDriver driver,int index) {
	   driver.switchTo().frame(index);
   }
   /**
    * This method is used to switch the frame based on the name
    * @param driver
    * @param name
    */
   public void switchToFrameByname(WebDriver driver,String name) {
	   driver.switchTo().frame(name);
	   }
   /**
    * this method is create to switch the frame based on the element
    * @param driver
    * @param element
    */
   public void switchToFrameByElement(WebDriver driver,WebElement element) {
	   driver.switchTo().frame(element);
   }
   /**
    * this method is to create to switch to the immediate parent frame
    * @param driver
    */
   public void switchToImmediateParentFrame(WebDriver driver) {
	   driver.switchTo().parentFrame();
   }
   /**
    * this method is to create to switch to the main frame
    * @param driver
    */
   public void switchToMainFrame(WebDriver driver) {
	   driver.switchTo().defaultContent();
   }
   //ScrollDown method(Scroll to element from action class is placed on action class,Robot class is not 
   //written here bcoz it does not belong to webdriver it is java.awt package)
   /**
    * this method is to perform Scroll down opertation based on JS
    * @param driver
    * @param jsvalue
    */
   public void scrollDownOperation(WebDriver driver,String jsvalue) {
	   JavascriptExecutor jse=(JavascriptExecutor)driver;
	   jse.executeScript(jsvalue);
   }
                     //Window popup
   /**
    * this method is use to perform switching operations in between windows
    * @param driver
    * @param ParentId
    */
   public void switchToWindow(WebDriver driver,String ParentId) {
	   Set<String>childIds=driver.getWindowHandles();
	   Iterator<String> itr=childIds.iterator();
	   
	   while(itr.hasNext()) {
		   String IDS=itr.next();
		   String ALLIDS=driver.switchTo().window(IDS).getTitle();
		   if(ParentId.contains(ALLIDS)) {
			   break;
		   }
	     }
	   }
   /**
    * this method is used to capture the Screenshot
    * @param driver
    * @param ScreenShotName
    * @return
    * @throws Exception
    */
   public String screenShotCaptueMethod(WebDriver driver,String ScreenShotName) throws Exception {
	   TakesScreenshot ts=(TakesScreenshot)driver;
	   File src=ts.getScreenshotAs(OutputType.FILE);
	   String path=".\\ScreenShot\\"+ScreenShotName+".png";
	   File dest=new File(path);
	   Files.copy(src, dest);
	   String finalPath=dest.getAbsolutePath();
	return finalPath;
	   }
   /**
    * Customize wait to click an element
    * @param element
    */
   public void customizeClickOnElement(WebElement element) throws Exception {
	   int count =1;
	   while(count<10) {
		   try {
			  element.click();
			  break;
		   }
		   catch (Exception e) {
			Thread.sleep(2000);
			count++;
		}
	 }
    }
   }