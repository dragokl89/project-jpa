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
}
