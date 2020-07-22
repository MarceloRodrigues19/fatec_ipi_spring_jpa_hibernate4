package com.example.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.example.demo.model.beans.Veiculo;
import com.example.demo.repository.JPAUtil;

public class InsereVeiculo {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();

		Veiculo v = new Veiculo();
		v.setBrand("Fiat");
		v.setModel("Siena");
		v.setYear(2012);
		v.setColor("Preto");
		
		manager.persist(v);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}
}
