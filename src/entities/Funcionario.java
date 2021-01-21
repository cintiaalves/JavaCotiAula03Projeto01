package entities;

public class Funcionario {

	private Integer idFuncionario;
	private String nome;
	private String cpf;
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Funcionario(Integer idFuncionario, String nome, String cpf) {
		super();
		this.idFuncionario = idFuncionario;
		this.nome = nome;
		this.cpf = cpf;
	}



	public Integer getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(Integer idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
	
	
	
	
}
