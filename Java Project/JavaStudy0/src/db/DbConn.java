package db;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Driver;

/**
 * ����mysql���ݿ�
 */
public final class DbConn
{
	public static  Connection getconn()
	{
		Connection conn = null;
		
		String user   = "root";
		String passwd = "";
		String url = "jdbc:mysql://127.0.0.1:3306/shoppingms";//orclΪoracle���ݿ�ʵ������
		
		//�Ѽ���������
		try
		{
			Class.forName("com.mysql.jdbc.Driver"); 
			
			conn = DriverManager.getConnection(url,user,passwd);
		}catch (SQLException e)
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		return conn;
	}

}
