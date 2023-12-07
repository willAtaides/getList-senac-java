package app;

import java.sql.SQLException;
import java.util.List;

import dao.CursoDao;
import modelo.Curso;

public class TestaGetLista {

	public static void main(String[] args) {
		try {
			CursoDao cdao = new CursoDao();
			List<Curso> cursos = cdao.getLista();
			
			System.out.println(cursos);
			
			for (Curso curso : cursos) {
				System.out.println("Nome: "+ curso.getNome());
				System.out.println("Código: "+ curso.getCodigo());
				System.out.println("Horas: "+ curso.getHoras());
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
