package db;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Driver;

/**
 * 连接mysql数据库
 */
public final class DbConn
{
	public static  Connection getconn()
	{
		Connection conn = null;
		
		String user   = "root";
		String passwd = "";
		String url = "jdbc:mysql://127.0.0.1:3306/shoppingms";//orcl为oracle数据库实例名字
		
		//已加载完驱动
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
