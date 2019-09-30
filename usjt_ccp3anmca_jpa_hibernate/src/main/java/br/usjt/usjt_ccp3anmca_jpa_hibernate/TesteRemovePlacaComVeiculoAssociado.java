package br.usjt.usjt_ccp3anmca_jpa_hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TesteRemovePlacaComVeiculoAssociado {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Placa p = manager.find(Placa.class, 5L);
		manager.remove(p);
		manager.close();
		JPAUtil.close();
	}

}
