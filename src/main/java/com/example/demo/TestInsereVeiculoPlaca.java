package com.example.demo;

import com.example.demo.model.beans.Placa;
import com.example.demo.model.beans.Veiculo;
import com.example.demo.repository.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

class TestInsereVeiculoPlaca {

    public static void main(String[] args) {

        EntityManager manager = JPAUtil.getEntityManager();
        EntityTransaction transaction = manager.getTransaction();

        transaction.begin();

        Placa p = new Placa();
        p.setCity("Santos");
        manager.persist(p);
        Veiculo v = new Veiculo();
        v.setBrand("Peugeot");
        v.setModel("Peugeot 208");
        v.setYear(2015);
        v.setPlaca(p);
        manager.persist(v);

        transaction.commit();
        manager.close();
        JPAUtil.close();
    }

}