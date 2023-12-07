package javaDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexoes {
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mariadb://jiraedu.rj.senac.br:3006/curso", "ads", "adsads");
	}
}
