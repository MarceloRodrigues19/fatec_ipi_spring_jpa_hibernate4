package com.example.demo.model.beans;

import javax.persistence.*;

	@Entity
	@Table (name = "tb_veiculo")
	public class Veiculo {
	
		@Id
		@GeneratedValue
		private Long id;

		@Column (nullable = false, length = 40)
		private String model;

		@Column (nullable = false, length = 40)
		private String brand;

		@Column (nullable = false)
		private int year;

		@Column (nullable = false, length = 40)
		private String color;

		@OneToOne (optional = false)
		@JoinColumn(name = "identificador_placa")
		private Placa placa;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public Placa getPlaca() { return placa; }

		public void setPlaca(Placa placa) { this.placa = placa; }

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
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
			Veiculo other = (Veiculo) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Veiculo [id=" + id + ", marca=" + brand + ", modelo=" + model + ", anoModelo=" + year + ", placa="
					+ placa + "]";
		}
	}