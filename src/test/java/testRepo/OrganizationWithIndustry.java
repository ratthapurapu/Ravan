package testRepo;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ExcelUtility;
import genericUtility.JavaUtiity;
import objectRepository.CreateOrganizationPagePom;
import objectRepository.HomePagePom;
import objectRepository.OrganizationListPagePom;

public class OrganizationWithIndustry extends BaseClass {
	@Test
	public void createOrganization() throws Exception {
		
	 JavaUtiity JUTIL=new JavaUtiity();
		int num=JUTIL.getRandomNumber();
		ExcelUtility EUTIL=new ExcelUtility();
		String OrgName=EUTIL.getDataFromExcel("org",3, 2);
		String value="Banking";
		
			HomePagePom HP=new HomePagePom(driver);
	    	  HP.clickOrganization();
	    	   OrganizationListPagePom OLP=new OrganizationListPagePom(driver);
	    	   OLP.clickCreateOrganization();
	    	   
	    	   CreateOrganizationPagePom COP=new CreateOrganizationPagePom(driver);
	    	   
	    	  COP.CreateOrganization(OrgName+num, value); 	   
   }
}