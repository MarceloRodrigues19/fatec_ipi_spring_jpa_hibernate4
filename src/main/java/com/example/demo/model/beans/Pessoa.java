package com.example.demo.model.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

    @Entity
    @Table(name = "tb_pessoa")
    public class Pessoa {

        @Id
        @GeneratedValue
        private Long id;
        private String name;

        @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL)
        private List<Veiculo> veiculos;

        public void setVeiculos(List<Veiculo> veiculos) {
            this.veiculos = veiculos;
        }

        public List<Veiculo> getVeiculos() {
            return veiculos;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
        this.name = name;
    }
}