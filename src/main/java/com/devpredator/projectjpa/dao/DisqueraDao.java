/**
 * 
 */
package com.devpredator.projectjpa.dao;

import java.util.List;

import com.devpredator.projectjpa.entity.Disquera;

/**
 * @author c-ado
 *Interfaz que genera el DAO para las transaccion de disquera
 */
public interface DisqueraDao {
 void guardar(Disquera disquera);
 void actualizar(Disquera disquera);
 void eliminar(Long id);
 
 List<Disquera> consultar();
 
 Disquera consultarById(long id);
 /**
  * metodo que permite consultar con JPQL disquera a partir de una descripcion
  * @param descripcion {@link String} descripcion de la disquera
  * @return {@link Disquera} la disquera consultada
  */
 Disquera consultarByDescripcionJPQL(String descripcion);
 /**
  * metodo que permite consultar con SQL Nativo disquera a partir de una desceripcion
  * @param descripcion {@link String} descripcion de la disquera
  * @return {@link Disquera} la disquera consultada
  */
 Disquera consultarByDescripcionNative(String descripcion);
 
}
