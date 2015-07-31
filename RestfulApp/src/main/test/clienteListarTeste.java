import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class clienteListarTeste {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("rest-unit");
		EntityManager em = emf.createEntityManager();

				Query query = em.createNamedQuery("Cliente.listarTodos");
				try {
					System.out.println(query.getResultList());
				} catch (NoResultException e) {
					System.out.println("Deu Merda");
				}
			}
	}
