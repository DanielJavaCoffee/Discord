package DAO;
import org.hibernate.Hibernate;
import org.hibernate.Session;

import dominio.Pessoa;
import hibernate.HibernateUtil;

public class PessoaDao {
	
	public void adicionarPessoa(Pessoa pessoa ) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(pessoa);
		session.getTransaction().commit();
		session.close();
		
		
	}

}
