package TestPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class JDBCBonnection {
	
	String oracledbUrl="jdbc:oracle:thin:@ec2-54-92-214-88.compute-1.amazonaws.com:1521:xe";
	String oracledbPassword="hr";
	String oracledbUserName="hr";
	
  @Test
  public void oracleJDBC() throws SQLException {
	  Connection connection=DriverManager.getConnection(oracledbUrl,oracledbUserName,oracledbPassword);
	  Statement statement=connection.createStatement();
	  ResultSet resultset=statement.executeQuery("select * from countries");
	  
	  resultset.next();
	  System.out.println(resultset.getString(1));
	  System.out.println(resultset.getString("country_name"));
	  System.out.println(resultset.getInt("region_id"));
	  
	  resultset.next();
	  System.out.println(resultset.getString(1));
	  System.out.println(resultset.getString("country_name"));
	  System.out.println(resultset.getInt("region_id"));
	  
	  resultset.next();
	  System.out.println(resultset.getString(1));
	  System.out.println(resultset.getString("country_name"));
	  System.out.println(resultset.getInt("region_id"));
	  
	  resultset.close();
	  statement.close();
	  connection.close();
  }
}
