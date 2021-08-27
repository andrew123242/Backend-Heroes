package com.estudioheroes.api.apirest.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "peleas")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Pelea  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombreHeroe;
	private String nombreVillano;
	private String vencedor;
	private Integer tiempo;
	@Temporal(TemporalType.DATE)
	private Date fecha;

	public Pelea(){
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreHeroe() {
		return nombreHeroe;
	}

	public void setNombreHeroe(String nombreHeroe) {
		this.nombreHeroe = nombreHeroe;
	}

	public String getNombreVillano() {
		return nombreVillano;
	}

	public void setNombreVillano(String nombreVillano) {
		this.nombreVillano = nombreVillano;
	}

	public String getVencedor() {
		return vencedor;
	}

	public void setVencedor(String vencedor) {
		this.vencedor = vencedor;
	}

	public Integer getTiempo() {
		return tiempo;
	}

	public void setTiempo(Integer tiempo) {
		this.tiempo = tiempo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Pelea [id=" + id + ", nombreHeroe=" + nombreHeroe + ", nombreVillano=" + nombreVillano + ", vencedor="
				+ vencedor + ", tiempo=" + tiempo + ", fecha=" + fecha + "]";
	}

}
