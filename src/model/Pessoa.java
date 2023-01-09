package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Pessoa {
	private String nome;
	private String sexo;
	private int idade;
	@Id
	private String cpf;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_ENDERECO", referencedColumnName = "ID_ENDERECO")
	private Endereco endereco;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "NUMERO_CONTA", referencedColumnName = "NUMERO")
	private Conta conta;

	@OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
	private List<Telefone> telefone;

	public Pessoa() {

	}

	public Pessoa(String nome, String sexo, int idade, String cpf) {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public List<Telefone> getTelefone() {
		return telefone;
	}

	public void setTelefone(List<Telefone> telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", cpf=" + cpf + ", endereco="
				+ endereco + ", conta=" + conta + ", telefone=" + telefone + "]";
	}

}