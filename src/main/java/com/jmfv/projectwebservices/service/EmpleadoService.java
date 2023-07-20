/**
 * 
 */
package com.jmfv.projectwebservices.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.jmfv.projectwebservices.entity.Empleado;

/**
 * @author jmfer
 *
 */
public class EmpleadoService {
	
	/**
	 * Metodo que permite consultar un empleado por su id
	 * @param numeroEmpleado {@link String} Numero del empleado
	 * @return {@link Empleado} 
	 */
	public Empleado consultarEmpleadoPorNumeroEmpleado(String numeroEmpleado) {
		List<Empleado> empleadosConsultados = this.consultarEmpleados();
	
		for (Empleado empleadoConsultado : empleadosConsultados) {
			if (empleadoConsultado.getNumeroEmpleado().equals(numeroEmpleado)) {
				return empleadoConsultado;
			}
		}
		
		return null;
	}
	
	/**
	 * Metodo que simula la consulta de un empleado
	 * @return {@link Empleado}
	 */
	public Empleado consultarEmpleado() {
		
		Empleado empleado = new Empleado();
		
		empleado.setNumeroEmpleado("123456");
		empleado.setNombre("Jose Manuel");
		empleado.setPrimerApellido("Fernandez");
		empleado.setSegunApellido("Vizcaino");
		empleado.setFechaCreacion(LocalDateTime.now());
		empleado.setEdad(20);
		
		return empleado;
	}
	
	/**
	 * Metodo que permite consultar la lista de empleados
	 * @return {@link List} Lista consultada
	 */
	public List<Empleado> consultarEmpleados() {
		List<Empleado> empleados = new ArrayList<Empleado>();
		
		Empleado empleado = new Empleado();
		
		empleado.setNumeroEmpleado("123456");
		empleado.setNombre("Jose Manuel");
		empleado.setPrimerApellido("Fernandez");
		empleado.setSegunApellido("Vizcaino");
		empleado.setFechaCreacion(LocalDateTime.now());
		empleado.setEdad(20);
		
		Empleado empleadoNuevo = new Empleado();
		
		empleadoNuevo.setNumeroEmpleado("789456");
		empleadoNuevo.setNombre("Erick");
		empleadoNuevo.setPrimerApellido("Gerrero");
		empleadoNuevo.setSegunApellido("Gómez");
		empleadoNuevo.setFechaCreacion(LocalDateTime.now());
		empleadoNuevo.setEdad(20);
		
		empleados.add(empleado);
		empleados.add(empleadoNuevo);
		
		return empleados;
	}
}
