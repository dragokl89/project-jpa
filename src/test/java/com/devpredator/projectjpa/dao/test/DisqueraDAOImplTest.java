/**
 * 
 */
package com.devpredator.projectjpa.dao.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.devpredator.projectjpa.dao.DisqueraDao;
import com.devpredator.projectjpa.dao.impl.DisqueraDAOImpl;
import com.devpredator.projectjpa.entity.Disquera;

/**
 * @author c-ado
 *
 */
class DisqueraDAOImplTest {

	
	private DisqueraDao DisqueraDAO = new DisqueraDAOImpl();
	/**
	 * Test method for {@link com.devpredator.projectjpa.dao.impl.DisqueraDAOImpl#guardar(com.devpredator.projectjpa.entity.Disquera)}.
	 */
	@Test
	void testGuardar() {
		
		Disquera disquera = new Disquera();
		disquera.setDescripcion("Elekid");
		disquera.setFechaCreacion(LocalDateTime.now());
		disquera.setEstatus(true);
		this.DisqueraDAO.guardar(disquera);
	}

	/**
	 * Test method for {@link com.devpredator.projectjpa.dao.impl.DisqueraDAOImpl#actualizar(com.devpredator.projectjpa.entity.Disquera)}.
	 */
	@Test
	void testActualizar() {
		Disquera disqueraConsultada = this.DisqueraDAO.consultarById(9L);
		disqueraConsultada.setDescripcion("Disquera Iron Maiden");
		this.DisqueraDAO.actualizar(disqueraConsultada);
	}

	/**
	 * Test method for {@link com.devpredator.projectjpa.dao.impl.DisqueraDAOImpl#eliminar(com.devpredator.projectjpa.entity.Disquera)}.
	 */
	@Test
	void testEliminar() {
		
	 this.DisqueraDAO.eliminar(9L);
	 
	}

	/**
	 * Test method for {@link com.devpredator.projectjpa.dao.impl.DisqueraDAOImpl#consultar()}.
	 */
	@Test
	void testConsultar() {
		List <Disquera>disquerasConsultadas = this.DisqueraDAO.consultar();
		assertTrue(disquerasConsultadas.size()>0);
		disquerasConsultadas.forEach(disquera ->{
			System.out.println("Disquera : "+ disquera.getDescripcion());
		});
	}

	/**
	 * Test method for {@link com.devpredator.projectjpa.dao.impl.DisqueraDAOImpl#consultarById(long)}.
	 */
	@Test
	void testConsultarById() {
		Disquera disquera = this.DisqueraDAO.consultarById(10L);
		System.out.println("Descripcion :"+ disquera.getDescripcion());
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
