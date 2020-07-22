package com.example.demo.model.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

    @Entity
    @Table (name = "tb_placa")
    public class Placa {

        @Id
        @GeneratedValue
        private Long idPlaca;
        private String city;

        public Long getIdPlaca() {
            return idPlaca;
        }
        public void setIdPlaca(Long idPlaca) {
            this.idPlaca = idPlaca;
        }
        public String getCity() {
            return city;
        }
        public void setCity(String city) {
            this.city = city;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((idPlaca == null) ? 0 : idPlaca.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Placa other = (Placa) obj;
            if (idPlaca == null) {
                if (other.idPlaca != null)
                    return false;
            } else if (!idPlaca.equals(other.idPlaca))
                return false;
            return true;
        }

        @Override
        public String toString() {
            return "Placa [identificador=" + idPlaca + ", cidade=" + city + "]";
        }
    }