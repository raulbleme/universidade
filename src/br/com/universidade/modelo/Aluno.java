package br.com.universidade.modelo;

public class Aluno {
	
	private int rm;
	private String nome;
	private String email;
	private String fone;
	private String dtMatricula;
	private Endereco endereco;
	
		public Aluno() {
		
	}
	
	public Aluno(int rm, String nome, String email, String fone, String dtMatricula, Endereco endereco) {
		this.rm = rm;
		this.nome = nome;
		this.email = email;
		this.fone = fone;
		this.dtMatricula = dtMatricula;
		this.endereco = endereco;
	}
	
	public void setAll(int rm, String nome, String email, String fone, String dtMatricula, Endereco endereco) {
		this.rm = rm;
		this.nome = nome;
		this.email = email;
		this.fone = fone;
		this.dtMatricula = dtMatricula;
		this.endereco = endereco;
	}
	
	public String getAll() {
		return "RM: " + rm + "\n" +
				"Nome: " + nome + "\n" +
				"E-mail: " + email + "\n" +
				"Telefone: " + fone + "\n" +
				"Data de Matrícula: " + dtMatricula + "\n" +
				"Endereço: " + endereco.getAll();
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getDtMatricula() {
		return dtMatricula;
	}
	public void setDtMatricula(String dtMatricula) {
		this.dtMatricula = dtMatricula;
	}

}
