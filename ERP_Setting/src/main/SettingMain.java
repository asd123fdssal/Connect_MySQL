package main;

import java.io.File;

import javax.swing.JOptionPane;

import jdbc.AssistJDBC;

public class SettingMain {

	public static void main(String[] args) {
		AssistJDBC ins = AssistJDBC.getInstance();
		for (String sql : Config.CD) {
			ins.updatePstmt(sql);
		}
		for (String sql : Config.CT) {
			ins.updatePstmt(sql);
		}
		String dir = System.getProperty("user.dir") + "\\DataFiles\\post\\";
		File file = new File(dir);
		System.out.println(file.getAbsolutePath());
		File[] fileNames = file.listFiles();
		ins.updatePstmt(String.format(Config.LP, fileNames[0].getAbsolutePath().replace("\\", "/"), "post"));
		ins.updatePstmt(Config.CU);
		JOptionPane.showMessageDialog(null, "ERP 데이터베이스 초기화 완료~!");
	}

}
