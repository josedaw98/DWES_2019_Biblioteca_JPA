package com.marcos.biblioteca.negocio.beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="ejemplar")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class EjemplarBean {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private long idEjemplar;

	@Column
	private String localizacion;

	
	@OneToMany(mappedBy="ejemplar")
	private List<PrestamoBean> prestamos = new ArrayList<PrestamoBean>();
	
	
	private void AddPrestamos(PrestamoBean prestamo) {
		if(!prestamos.contains(prestamo)) {
			prestamos.add(prestamo);
			prestamo.setEjemplar(this);
		}
	}
	
	
	public long getIdEjemplar() {
		return idEjemplar;
	}

	public void setIdEjemplar(long idEjemplar) {
		this.idEjemplar = idEjemplar;
	}

	public String getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	
	
	
	
	

}
