/**
 * 
 */
package com.devpredator.projectjpa.dao;

import java.util.List;

import com.devpredator.projectjpa.entity.SubGenero;

/**
 * @author c-ado Interfaz DAO que realiza el CRUD con JPA para la tabla de
 *         subgenero
 */
public interface SubGeneroDAO {
	
	/**
	 * Metodo que permite guardar un Subgenero
	 * @param subgenero {@link Subgenero} objeto a guardar
	 */
	void guardar(SubGenero subgenero);
	/**
	 * Metodo que permite actualizar un Subgenero
	 * @param subgenero {@link Subgenero} objeto a actualizar
	 */
	void actualizar(SubGenero subgenero);
	/**
	 * Metodo que permite eliminar un Subgenero por su identificador
	 * @param subgenero {@link Long} identificador del subgenero a eliminar
	 */
	void eliminar(Long id);
/**
 * Metodo que permite consultar la lista de Subgeneros
 * @return {@link List} lista de subgeneros consultados 
 */
	List<SubGenero> consultar();
/**
 * Metodo que permite consulta un subgenero a partir de su id 
 * @param id {@link Long} identificador del subgenero a consultar
 * @return {@link Subgenero} un objeto subgenero consultado
 */
	SubGenero consultarById(Long id);
}
