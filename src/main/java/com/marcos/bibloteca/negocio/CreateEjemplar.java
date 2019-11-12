package com.marcos.bibloteca.negocio;

import javax.persistence.EntityManager;

import com.marcos.biblioteca.negocio.beans.EjemplarBean;
import com.marcos.bibloteca.util.ConnectionEntityManagerFactory;



/**
 * Clase que inserta autores en la base de datos
 * @author marcos
 *
 */
public class CreateEjemplar {

	

	public void create(EjemplarBean ejemplar) {
		
		// Recoge la conexi�n
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacci�n, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(ejemplar);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}
