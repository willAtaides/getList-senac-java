package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javaDB.FabricaDeConexoes;
import modelo.Curso;

public class CursoDao {

	private Connection con;

	public CursoDao() throws SQLException {
		this.con = FabricaDeConexoes.getConnection();
	}


	
	public List<Curso> getLista() throws SQLException{
		String sql = "select * from cursos";
		PreparedStatement stmt = con.prepareStatement(sql);
		ResultSet rset = stmt.executeQuery();
		
		List<Curso> cursos = new ArrayList<Curso>();
		
		while(rset.next()) {
			Curso curso = new Curso();
			curso.setNome(rset.getString("nome"));
			curso.setCodigo(rset.getString("codigo"));
			curso.setHoras(rset.getInt("horas"));
			cursos.add(curso);
		}
		rset.close();
		stmt.close();
		con.close();
		
		return cursos;
	}
}