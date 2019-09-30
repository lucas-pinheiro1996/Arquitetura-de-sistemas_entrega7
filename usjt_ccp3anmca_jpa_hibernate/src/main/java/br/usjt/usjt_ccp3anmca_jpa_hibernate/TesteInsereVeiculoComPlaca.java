package br.usjt.usjt_ccp3anmca_jpa_hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TesteInsereVeiculoComPlaca {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Placa p = new Placa();
		p.setIdentificador("KDG-5443");
		p.setCidade("São Paulo-SP");
		manager.persist(p);
		Veiculo v = new Veiculo();
		v.setModelo("i30");
		v.setMarca("Hyundai");
		v.setCor("preto");
		v.setAnoDeFabricacao("2010");
		v.setPlaca(p);
		manager.persist(v);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}

}
