package com.marcos.bibloteca.negocio;

import javax.persistence.EntityManager;

import com.marcos.biblioteca.negocio.beans.AutorBean;
import com.marcos.bibloteca.util.ConnectionEntityManagerFactory;



/**
 * Clase que inserta autores en la base de datos
 * @author marcos
 *
 */
public class CreateAutor {

	

	public void create(AutorBean autor) {
		
		// Recoge la conexi�n
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacci�n, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(autor);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}
