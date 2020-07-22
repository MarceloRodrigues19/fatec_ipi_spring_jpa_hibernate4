package com.example.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.example.demo.model.beans.Veiculo;
import com.example.demo.repository.JPAUtil;

public class AtualizaVeiculo {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();

		Veiculo car = manager.find(Veiculo.class, 1L);
		car.setBrand("Jeep");
		car.setModel("Jeep Renegade");
		car.setYear(2018);

		transaction.commit();

		manager.close();
		JPAUtil.close();
	}

}