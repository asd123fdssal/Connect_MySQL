package jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AssistJDBC {

	private static AssistJDBC instance = new AssistJDBC();

	public static AssistJDBC getInstance() {
		return instance;
	}

	private PreparedStatement pstmt;

	public PreparedStatement getPstmt(String sql, Object... objects) {
		try {
			pstmt = DBCon.getConnection().prepareStatement(sql);
			for (int i = 0; i < objects.length; i++) {
				pstmt.setObject(i + 1, objects[i]);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(pstmt);
		return pstmt;
	}
	
	public void updatePstmt(String sql, Object...objects){
		try {
			getPstmt(sql, objects).executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
