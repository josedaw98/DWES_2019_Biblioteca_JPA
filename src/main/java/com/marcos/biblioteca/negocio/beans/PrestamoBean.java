package com.marcos.biblioteca.negocio.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="prestamo")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class PrestamoBean {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private long idPrestamo;
	
	@Column
	private String fechaPrestamo;
	
	@Column
	private String fechaDevolucion;
	
	@ManyToOne
	private EjemplarBean ejemplar;
	
	
	public UsuarioBean getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioBean usuario) {
		this.usuario = usuario;
	}

	public void setIdPrestamo(long idPrestamo) {
		this.idPrestamo = idPrestamo;
	}

	@ManyToOne
	private UsuarioBean usuario;
	
	
	

	public long getIdPrestamo() {
		return idPrestamo;
	}

	public void setIdPrestam(long idPrestamo) {
		this.idPrestamo = idPrestamo;
	}

	public String getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(String fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public String getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(String fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public EjemplarBean getEjemplar() {
		return ejemplar;
	}

	public void setEjemplar(EjemplarBean ejemplar) {
		this.ejemplar = ejemplar;
	}
	
	
	
	
	
	
}
