package dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import dao.PessoaDAO;

import model.Pessoa;
import model.util.JpaUtil;

public class PessoaDAOImpl implements PessoaDAO {

	private EntityManager em;
	private EntityTransaction et;

	@Override
	public void salvar(Pessoa pessoa) {
		try {
			this.em = JpaUtil.getEntityManager();
			et = em.getTransaction();
			et.begin();
			em.persist(pessoa);
			et.commit();

		} catch (Exception e) {
			if (em.isOpen()) {
				et.rollback();
			}
			System.out.println(" Erro transacao");

		} finally {
			if (em.isOpen()) {
				em.close();
			}
		}

	}

	@Override
	public void alterar(Pessoa pessoa) {
		try {
			this.em = JpaUtil.getEntityManager();
			et = em.getTransaction();
			et.begin();
			em.merge(pessoa);
			et.commit();

		} catch (Exception e) {
			if (em.isOpen()) {
				et.rollback();
			}
			System.out.println(" Erro transacao");

		} finally {
			if (em.isOpen()) {
				em.close();
			}
		}

	}

	@Override
	public void remover(String cpf) {
		try {
			this.em = JpaUtil.getEntityManager();
			et = em.getTransaction();
			et.begin();
			em.remove(em.find(Pessoa.class, cpf));
			et.commit();

		} catch (Exception e) {
			if (em.isOpen()) {
				et.rollback();
			}
			System.out.println(" Erro transacao");

		} finally {
			if (em.isOpen()) {
				em.close();
			}
		}

	}

	@Override
	public Pessoa pesquisar(String cpf) {
		Pessoa pessoa = new Pessoa();
		try {
			this.em = JpaUtil.getEntityManager();
			pessoa = em.find(Pessoa.class, cpf);
		} catch (Exception e) {
			if (em.isOpen()) {
				et.rollback();
			}
			System.out.println("Erro transação");
		} finally {
			if (em.isOpen()) {
				em.close();
			}
		}

		return pessoa;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Pessoa> listaTodos() {
		this.em = JpaUtil.getEntityManager();
		Query query = em.createQuery("from Pessoa p");
		List<Pessoa> listarPessoa = query.getResultList();
		em.clear();

		return listarPessoa;
	}
}
