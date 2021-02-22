/**
 * 
 */
package com.devpredator.projectjpa.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.devpredator.projectjpa.dao.DisqueraDao;
import com.devpredator.projectjpa.entity.Disquera;

/**
 * @author c-ado Clase que implementa las trassaciones de la tabla diquera
 */
public class DisqueraDAOImpl implements DisqueraDao {

	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
			.createEntityManagerFactory("persistenceDevPredator");

	@Override
	public void guardar(Disquera disquera) {
		// TODO Auto-generated method stub
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();

		try {
			em.persist(disquera);
			et.commit();
		} catch (Exception e) {
              if(et !=null) {
            	  et.rollback();
              }
              e.printStackTrace();
              
		}finally {
			em.close();
		}

	}

	@Override
	public void actualizar(Disquera disquera) {
		// TODO Auto-generated method stub
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();

		try {
			em.merge(disquera);
			et.commit();
		} catch (Exception e) {
              if(et !=null) {
            	  et.rollback();
              }
              e.printStackTrace();
              
		}finally {
			em.close();
		}
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		Disquera disqueraConsultada = em.find(Disquera.class, id);
		
		EntityTransaction et = em.getTransaction();
		et.begin();

		try {
			em.remove(disqueraConsultada);
			et.commit();
		} catch (Exception e) {
              if(et !=null) {
            	  et.rollback();
              }
              e.printStackTrace();
              
		}finally {
			em.close();
		}
	}

	@Override
	public List<Disquera> consultar() {
		// TODO Auto-generated method stub
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		TypedQuery <Disquera> disqueraQuery = (TypedQuery<Disquera>) em.createQuery("FROM Disquera ORDER BY descripcion");
		return disqueraQuery.getResultList();
	}

	@Override
	public Disquera consultarById(long id) {
		// TODO Auto-generated method stub
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		
		Disquera disqueraConsultada = em.find(Disquera.class, id);
		
		if(disqueraConsultada == null ) {
			throw new EntityNotFoundException("La disquera "+id+" no existe");
		}
		
		return disqueraConsultada;
	}

}
