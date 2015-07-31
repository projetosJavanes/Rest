package com.rest.Entity.Service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.rest.Entity.Cliente;

public class ClienteService {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("rest-unit");
	EntityManager em = emf.createEntityManager();

	
	private static ClienteService instance;

	
	public static ClienteService getInstance(){
	if(instance == null)
	instance = new ClienteService();
	return instance;
	}
	
		public void inserirCliente(Cliente cliente){
			try {
				em.getTransaction().begin();
				em.persist(cliente);
				em.getTransaction().commit();
				
				em.close();
				emf.close();
			} catch (Exception e) {
				System.out.println("Deu merda!");
				em.close();
				emf.close();
			}
			
		}
	
		public List<Cliente> listarTodos() {
			Query query = em.createNamedQuery("Cliente.listarTodos");
			try {
				return query.getResultList();
			} catch (NoResultException e) {
				return null;
			}
		}
}
