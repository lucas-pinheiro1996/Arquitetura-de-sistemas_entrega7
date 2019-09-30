package br.usjt.usjt_ccp3anmca_jpa_hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class TesteListaTodosJPQ {
	
	public static void main(String[] args) { 
		
		EntityManager manager = JPAUtil. getEntityManager (); 
		Query query = manager.createQuery("from Usuario"); 
		List <Veiculo> veiculo = query.getResultList(); 
		for (Veiculo v : veiculo) { 
			
			System. out .println(v); 
			
			} 
		manager.close(); 
		JPAUtil. close (); }

	
}
