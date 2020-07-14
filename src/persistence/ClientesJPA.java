package persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Cliente;

public class ClientesJPA {
	public static void ListaClientes() {
		final List<Cliente> resultList = extracted();
		for (Cliente cl : resultList) {
			System.out.println(cl.getIdclientes() + "-" + cl.getNomclientes());
		}

	}

	private static List<Cliente> extracted() {
		final EntityManager eM = Persistence.createEntityManagerFactory("pdv2").createEntityManager();
		final Query query = eM.createNamedQuery("Cliente.findAll");
		List resultList = query.getResultList();
		return resultList;
	}

	public static void creaClientes(Cliente cl) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdv2");
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(cl);
			em.getTransaction().commit();
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			em.close();

		}

	}
	
	public static void actualizaClientes(int id,String newNombre, String newEmail) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdv2");
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			Cliente cliente = em.find(Cliente.class, id);
			cliente.setEmailclientes(newEmail);
			cliente.setNomclientes(newNombre);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
	}
	
	public static void eliminaClientes(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdv2");
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			Cliente cliente = em.find(Cliente.class, id);
			em.remove(cliente);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
	}

}


