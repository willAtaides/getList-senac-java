package javaDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JdbcTeste {

	public static void main(String[] args){
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:mariadb://jiraedu.rj.senac.br:3006/curso", "ads", "adsads");
			System.out.println("Conectado ao banco a cima");
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
