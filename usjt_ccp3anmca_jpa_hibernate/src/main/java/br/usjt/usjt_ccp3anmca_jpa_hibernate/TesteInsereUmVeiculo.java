package br.usjt.usjt_ccp3anmca_jpa_hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TesteInsereUmVeiculo {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Veiculo v = new Veiculo();
		v.setModelo("i30");
		v.setMarca("Hyundai");
		v.setCor("preto");
		v.setAnoDeFabricacao("2010");
		manager.persist(v);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}

}
