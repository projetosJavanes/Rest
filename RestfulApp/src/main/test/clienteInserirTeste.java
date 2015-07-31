import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import com.rest.Entity.Cliente;



public class clienteInserirTeste {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("rest-unit");
		EntityManager em = emf.createEntityManager();
		
		Cliente c = new Cliente();
		c.setNome("Fulano 2");
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
	
	
}
