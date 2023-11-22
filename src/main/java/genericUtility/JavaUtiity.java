package genericUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
/**
 * This class is use to perform all the java related operation
 */
public class JavaUtiity {
	/**
	 * This method is a generic method to generate random number
	 * @return
	 */
   public int getRandomNumber() {
	   Random r=new Random();
	   int randomNumber=r.nextInt(1000);
	return randomNumber;
   }
   /**
    * This method is used to provide the current date
    * @return
    */
   public String getDateUsingCalendar() {
	 Calendar cal=  Calendar.getInstance();
	 Date d=cal.getTime();
	 SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
	 String modifiedDate=sdf.format(d);
	return modifiedDate;
	 
	 
   }
}