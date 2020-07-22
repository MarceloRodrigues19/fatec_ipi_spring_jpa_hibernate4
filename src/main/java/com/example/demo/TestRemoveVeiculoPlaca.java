package com.example.demo;

import com.example.demo.model.beans.Placa;
import com.example.demo.repository.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TestRemoveVeiculoPlaca {

    public static void main(String[] args) {

        EntityManager manager = JPAUtil.getEntityManager();
        EntityTransaction transaction = manager.getTransaction();

        transaction.begin();

        Placa p = manager.find(Placa.class, 1L);
        manager.remove(p);

        transaction.commit();
        manager.close();
        JPAUtil.close();
    }
}
