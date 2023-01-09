package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import dao.PessoaDAO;
import dao.impl.PessoaDAOImpl;
import model.Pessoa;
import model.util.JpaUtil;

public class Principal {

	public static void main(String[] args) {
		EntityManager em = JpaUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.close();

//		===============conta======================

//		ContaDAO contaDAO = new ContaDAOImpl();
//		Conta conta = new Conta();
//		
//		conta.setNumero(12);
//		conta.setSaldo(0000.0);
//		conta.setLimite(0000.0);
//		contaDAO.salvar(conta);
//		System.out.println("Conta salva.");

//		conta.setNumero(95);
//		conta.setSaldo(100.0);
//		conta.setLimite(500.0);
//		contaDAO.alterar(conta);
//		System.out.println("Conta alterada.");

//		Conta conta1 = contaDAO.pesquisar(1010);
//		System.out.println(conta1.toString());

//		List<Conta> listarConta = contaDAO.listartodos();
//		for (Conta c : listarConta) {
//			System.out.println(c.toString());
//		}
//		
//		contaDAO.remover(2881);

//    ================endereço================

//		EnderecoDAO enderecoDAO = new EnderecoDAOImpl();
//		Endereco endereco = new Endereco();

//		endereco.getId();
//		endereco.setRua("Rua 22");
//		endereco.setNumero(56);
//		endereco.setComplemento("APT");
//		enderecoDAO.salvar(endereco);
//		System.out.println("Endereco salva.");

//		endereco.getId();
//		endereco.setRua("Rua 30");
//		endereco.setNumero(15);
//		endereco.setComplemento("APT");
//		enderecoDAO.alterar(endereco);

//		Endereco endereco1 = enderecoDAO.pesquisar(12);
//		System.out.println(endereco1.toString());

//		List<Endereco> listarEndereco = enderecoDAO.listarTodos();
//		for (Endereco e : listarEndereco) {
//			System.out.println(e.toString());

//		enderecoDAO.remover(25);

//		=============pessoa=======================

		PessoaDAO pessoaDAO = new PessoaDAOImpl();
		Pessoa pessoa = new Pessoa();
//		pessoa.getEndereco().getId();
//		pessoa.getConta().getNumero();

		pessoa.setNome("Henrrique");
		pessoa.setIdade(30);
		pessoa.setSexo("H");
		pessoa.setCpf("02369598856");
		pessoaDAO.salvar(pessoa);

//		pessoa.setNome("Sandro");
//		pessoa.setIdade(30);
//		pessoa.setSexo("H");
//		pessoa.setCpf("02452154621");
//		pessoaDAO.alterar(pessoa);

//		pessoaDAO.remover("03266688585");

//		Pessoa pessoa2 = pessoaDAO.pesquisar("02369787481");
//		System.out.println(pessoa2.toString());

//		List<Pessoa> listaPessoa = pessoaDAO.listaTodos();
//		for (Pessoa p : listaPessoa) {
//			System.out.println(p.toString());	
//		}		

//	=================Salvar tudo=================================

//		Pessoa pessoa = new Pessoa();
//		Endereco endereco = new Endereco();
//		Conta conta = new Conta();
//		
//		endereco.getId();
//		endereco.setNumero(25);
//		endereco.setRua("Rua aga");
//		endereco.setComplemento("apt");
//		
//		
//		conta.setNumero(981);
//		conta.setSaldo(100.0);
//		conta.setLimite(100.0);
//						
//		
//		pessoa.setEndereco(endereco);
//		pessoa.setConta(conta);
//		
//		pessoa.setNome("Pera");
//		pessoa.setSexo("M");
//		pessoa.setIdade(5);
//		pessoa.setCpf("03266688980");
//		pessoa.getEndereco().getId();
//		pessoa.getConta().getNumero();
//		
//		pessoaDAO.salvar(pessoa);

//	===================================================================	

//		Pessoa pessoa = new Pessoa();
//		Endereco endereco = new Endereco();
//		Conta conta = new Conta();
//		Telefone telefone = new Telefone();

//		endereco.getId();
//		endereco.setNumero(9999);
//		endereco.setRua("Rua 65");
//		endereco.setComplemento("apt");
//		
//		
//		conta.setNumero(521);
//		conta.setSaldo(652.0);
//		conta.setLimite(100.0);
//						
//		
//		pessoa.setEndereco(endereco);
//		pessoa.setConta(conta);
//		
//		pessoa.setNome("bb");
//		pessoa.setSexo("M");
//		pessoa.setIdade(25);
//		pessoa.setCpf("03468785422");
//		pessoa.getEndereco().getId();
//		pessoa.getConta().getNumero();
//		
//		List<Telefone> list = new ArrayList<Telefone>();
//		telefone = new Telefone(81992843065l, TipoTelefoneEnum.CELULAR, pessoa);
//		list.add(telefone);
//		
//		pessoa.setTelefone(list);
//		pessoa.setConta(conta);
//		pessoa.setEndereco(endereco);
//		
//				
//		pessoaDAO.salvar(pessoa);

//		Pessoa pessoa1 = pessoaDAO.pesquisar("03468785422");
//		System.out.println(pessoa1.toString());
	}

}
