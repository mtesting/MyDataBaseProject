package mydata;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.DriverManager;

import org.junit.Test;



public class Myconnection {
	@Test
		public void myConnection()
		{
		Connection conn=null;
		String url="jdbc:mysql://localhost:3306/userlogin";
		String database="userlogin";
		String username="root";
		String password="hello123";
		Statement s=null;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			 conn = DriverManager.getConnection(url, username, password);
			 String createTable = "CREATE TABLE Login (" 
				        + "Username VARCHAR(10),"  
				        + "Password VARCHAR(8))" ;
			 s=conn.createStatement();
			 //s.executeUpdate(createTable);
			 s.executeUpdate("insert into Login(Username,Password)values('Girish','girish')");
			ResultSet rs= s.executeQuery("select * from Login");
			while(rs.next())
			{
				String str = rs.getString("Username");
				String str1=rs.getString("Password");
				
				
			
			System.out.println(str+"  "+str1);
			}
	
			 
				         
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally
		{
			if(conn!=null)
			{
				conn=null;
				
			}
		}
		
		

	}
	}



