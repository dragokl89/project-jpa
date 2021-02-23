/**
 * 
 */
package com.devpredator.projectjpa.dao.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.devpredator.projectjpa.dao.SubGeneroDAO;
import com.devpredator.projectjpa.dao.impl.SubGeneroDAOImpl;
import com.devpredator.projectjpa.entity.Genero;
import com.devpredator.projectjpa.entity.SubGenero;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author c-ado Clase de test para probar metodos
 */
class SubGeneroDAOImplTest {
	private SubGeneroDAO subgeneroDao = new SubGeneroDAOImpl();

	/**
	 * Test method for
	 * {@link com.devpredator.projectjpa.dao.impl.SubGeneroDAOImpl#guardar(com.devpredator.projectjpa.entity.SubGenero)}.
	 */
	@Test
	void testGuardar() {
		SubGenero subgenero = new SubGenero ();
		subgenero.setDescripcion("Hard Core");
		subgenero.setFechaCreacion(LocalDateTime.now());
		subgenero.setEstatus(true);
		
		Genero genero = new Genero();
		genero.setDescripcion("Metal");
		genero.setFechaCreacion(LocalDateTime.now());
		genero.setEstatus(true);
		
		subgenero.setGenero(genero);
		
		this.subgeneroDao.guardar(subgenero);
	}

	/**
	 * Test method for
	 * {@link com.devpredator.projectjpa.dao.impl.SubGeneroDAOImpl#actualizar(com.devpredator.projectjpa.entity.SubGenero)}.
	 */
	@Test
	void testActualizar() {
		SubGenero subgenero = this.subgeneroDao.consultarById(7L);
		subgenero.setDescripcion("Trash Metal");
		subgenero.getGenero().setDescripcion("Metal Trash");
		
		this.subgeneroDao.actualizar(subgenero);
	}

	/**
	 * Test method for
	 * {@link com.devpredator.projectjpa.dao.impl.SubGeneroDAOImpl#eliminar(java.lang.Long)}.
	 */
	@Test
	void testEliminar() {
		this.subgeneroDao.eliminar(7L);
	}

	/**
	 * Test method for
	 * {@link com.devpredator.projectjpa.dao.impl.SubGeneroDAOImpl#consultar()}.
	 */
	@Test
	void testConsultar() {
		List<SubGenero> subgenerosConsultados = this.subgeneroDao.consultar();

		assertTrue(subgenerosConsultados.size() > 0);
		for (SubGenero subGenero : subgenerosConsultados) {
			System.out.println("Subgenero : " + subGenero.getDescripcion());
			System.out.println("Genero : " + subGenero.getGenero().getDescripcion());
		}
	}

	/**
	 * Test method for
	 * {@link com.devpredator.projectjpa.dao.impl.SubGeneroDAOImpl#consultarById(java.lang.Long)}.
	 */
	@Test
	void testConsultarById() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#Object()}.
	 */
	@Test
	void testObject() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#getClass()}.
	 */
	@Test
	void testGetClass() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#hashCode()}.
	 */
	@Test
	void testHashCode() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#equals(java.lang.Object)}.
	 */
	@Test
	void testEquals() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#clone()}.
	 */
	@Test
	void testClone() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#toString()}.
	 */
	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#notify()}.
	 */
	@Test
	void testNotify() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#notifyAll()}.
	 */
	@Test
	void testNotifyAll() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#wait()}.
	 */
	@Test
	void testWait() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#wait(long)}.
	 */
	@Test
	void testWaitLong() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#wait(long, int)}.
	 */
	@Test
	void testWaitLongInt() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#finalize()}.
	 */
	@Test
	void testFinalize() {
		fail("Not yet implemented");
	}

}
