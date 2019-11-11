package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {

	private static DBCon instance = new DBCon();

	public static DBCon getInstance() {
		return instance;
	}

	private static Connection con;

	public DBCon() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "1234");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		if (instance == null) {
			new DBCon();
		}
		return con;
	}

}
