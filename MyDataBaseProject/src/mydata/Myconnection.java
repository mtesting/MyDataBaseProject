package mydata;


import org.junit.Test;

import com.mysql.jdbc.Connection;

public class Myconnection {
	@Test
		public void myConnection()
		{
		Connection conn=null;
		String url="jdbc:mysql://localhost:3306/";
		String database="userlogin";
		String username="root";
		String password="root";
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
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



