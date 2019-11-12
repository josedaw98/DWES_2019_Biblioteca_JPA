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
@Table(name="usuario")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public class UsuarioBean {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private long idUsuario;

	@Column
	private String nombre;

	
	@Column
	private String telefono;

	@Column
	private String direccion;

	@OneToMany(mappedBy="usuario")
	private List<PrestamoBean> prestamos = new ArrayList<PrestamoBean>();
	
	
	private void AddPrestamos(PrestamoBean prestamo) {
		if(!prestamos.contains(prestamo)) {
			prestamos.add(prestamo);
			prestamo.setUsuario(this);
		}
	}
	
	
	public long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

		
	
	
	
	
	
}
