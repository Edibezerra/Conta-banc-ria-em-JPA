package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Telefone {
	@Id
	@Column(name = "ID_TELEFONE")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TELEFONE")
	@SequenceGenerator(name = "TELEFONE", sequenceName = "S_ID_TELEFONE", allocationSize = 1, initialValue = 1)

	private Long id;
	private long numero;
	@Enumerated(EnumType.STRING)
	private TipoTelefoneEnum tipo;
	@ManyToOne
	@JoinColumn(name = "CPF_PESSOA")

	private Pessoa pessoa;

	public Telefone() {

	}

	public Telefone(Long id, long numero, TipoTelefoneEnum tipo, Pessoa pessoa) {

		this.id = id;
		this.numero = numero;
		this.tipo = tipo;
		this.pessoa = pessoa;
	}

	public Telefone(long numero, TipoTelefoneEnum residencial, Pessoa pessoa2) {

		this.numero = numero;
		this.tipo = residencial;
		this.pessoa = pessoa2;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public TipoTelefoneEnum getTipo() {
		return tipo;
	}

	public void setTipo(TipoTelefoneEnum tipo) {
		this.tipo = tipo;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public String toString() {
		return "Telefone [id=" + id + ", numero=" + numero + ", tipo=" + tipo + "]";
	}

}
