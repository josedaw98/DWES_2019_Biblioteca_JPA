package com.marcos.bibloteca.negocio;

import javax.persistence.EntityManager;

import com.marcos.biblioteca.negocio.beans.AutorBean;
import com.marcos.biblioteca.negocio.beans.PrestamoBean;
import com.marcos.bibloteca.util.ConnectionEntityManagerFactory;



/**
 * Clase que inserta autores en la base de datos
 * @author marcos
 *
 */
public class CreatePrestamo {

	

	public void create(PrestamoBean prestamo) {
		
		// Recoge la conexión
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacción, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(prestamo);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}
