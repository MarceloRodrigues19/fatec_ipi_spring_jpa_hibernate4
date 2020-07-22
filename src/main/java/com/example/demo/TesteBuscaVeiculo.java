package com.example.demo;

import javax.persistence.EntityManager;

import com.example.demo.model.beans.Veiculo;
import com.example.demo.repository.JPAUtil;

public class TesteBuscaVeiculo {

	public static void main(String[] args) {

		EntityManager manager = JPAUtil.getEntityManager();

		Veiculo v = manager.find(Veiculo.class, 1L);
		System.out.println(v);
		manager.close();
		JPAUtil.close();

	}

}
