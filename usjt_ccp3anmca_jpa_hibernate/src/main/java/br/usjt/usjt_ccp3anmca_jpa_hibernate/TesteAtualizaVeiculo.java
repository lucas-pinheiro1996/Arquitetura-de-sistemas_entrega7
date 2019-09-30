package br.usjt.usjt_ccp3anmca_jpa_hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TesteAtualizaVeiculo {
	
	public static void main(String[] args) { 
		
		EntityManager manager = JPAUtil. getEntityManager (); 
		EntityTransaction transaction = manager.getTransaction(); 
		transaction.begin(); 
		Veiculo v = manager.find(Veiculo.class, 1L); 
		System.out.println("Antes de atualizar: " + v);
		v.setModelo("golf");
		v.setMarca("Volkswagen");
		v.setCor("vermelho");
		v.setAnoDeFabricacao("2012");
		System.out.println("Antes do commit: " + v);
		transaction.commit(); 
		System.out.println("Depois do commit: " + v);
		manager.close(); 
		JPAUtil. close (); }

	
}
