package modelo;

import java.io.Serializable;
import java.util.Objects;

public class Curso implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private String nome;
	private String codigo;
	private int horas;
	private int status;
	private int tipoId;
	
	public Curso() {
		}

	public Curso(Long id, String nome, String codigo, int horas, int status, int tipoId) {
		this.id = id;
		this.nome = nome;
		this.codigo = codigo;
		this.horas = horas;
		this.status = status;
		this.tipoId = tipoId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getTipoId() {
		return tipoId;
	}

	public void setTipoId(int tipoId) {
		this.tipoId = tipoId;
	}

	@Override
	public String toString() {
		return "Curso [id=" + id + ", nome=" + nome + ", codigo=" + codigo + ", horas=" + horas + ", status=" + status
				+ ", tipoId=" + tipoId + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, horas, id, nome, status, tipoId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		return Objects.equals(codigo, other.codigo) && horas == other.horas && Objects.equals(id, other.id)
				&& Objects.equals(nome, other.nome) && status == other.status && tipoId == other.tipoId;
	}
	



}
