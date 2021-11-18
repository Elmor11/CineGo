package com.init.products.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name=("reservas"))
public class Product {
	@Id
	@Column(name="NumReserva")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long NumResreva;
	
	@Column(name="NomTitular", nullable=false, length=30 )
	private String NomTitular;
	
	@Column(name="Ubicacion_silla", nullable=false, length=30 )
	private String Ubicacion_silla;
	
	@Column(name="Pagado", nullable=false, length=30 )
	private String Pagado;

	public long getNumResreva() {
		return NumResreva;
	}

	public void setNumResreva(long numResreva) {
		NumResreva = numResreva;
	}

	public String getNomTitular() {
		return NomTitular;
	}

	public void setNomTitular(String nomTitular) {
		NomTitular = nomTitular;
	}

	public String getUbicacion_silla() {
		return Ubicacion_silla;
	}

	public void setUbicacion_silla(String ubicacion_silla) {
		Ubicacion_silla = ubicacion_silla;
	}

	public String getPagado() {
		return Pagado;
	}

	public void setPagado(String pagado) {
		Pagado = pagado;
	}
	
	
}
