package br.usjt.usjt_ccp3anmca_jpa_hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TesteRemoveVeiculo {
	
	public static void main(String[] args) { 
		
		EntityManager manager = JPAUtil. getEntityManager (); 
		EntityTransaction transaction = manager.getTransaction(); 
		transaction.begin(); Veiculo v = manager.find(Veiculo.class, 10L); 
		System.out.println("Antes de remover: " + v);
		manager.remove(v); 
		System.out.println("Antes do commit: " + v);
		transaction.commit(); 
		System.out.println("Depois do commit: " + v);
		manager.close(); 
		JPAUtil. close (); }
	
}
