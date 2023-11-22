package genericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
/*
 * this class contains all the generic methods regarding DataBase
 */

public class DataBaseUtility {
      Connection c=null;
      /**
       * this method is create to establish the database connection
       * @throws Exception
       */
      public void establishConnection() throws Exception {
   DriverManager.getConnection(IconstantUtility.dbpath,IconstantUtility.dbUsername,IconstantUtility.dbPass);
    	  
      }
      /**
       * this method is use to close the database connection
       * @throws Exception
       */
      public void closeConnection() throws Exception {
    	  c.close();
      }
      /**
       * this method is use to execute the query
       * @param querry
       * @param colIndex
       * @param expData
       * @return
       * @throws Exception
       */
      public String executeQueryOperation(String querry,int colIndex,String expData) throws Exception {
    	  boolean flag=false;
    	  ResultSet rs=c.createStatement().executeQuery(querry);//We can do method chaining also
    	  while(rs.next()) {
    		  String actualData=rs.getString(colIndex);
    		  if(actualData.equals(actualData)) {
    			  flag=true;
    			  break;
    		  }
    	  }
    			  if(flag)
    			  {
    				  System.out.println("Expected data is :"+expData);
    				  return expData;
    		  }
    			  else {
    				  System.out.println("Data is not present");
    				  return "";
    			  }
    	  }
    	  
      }