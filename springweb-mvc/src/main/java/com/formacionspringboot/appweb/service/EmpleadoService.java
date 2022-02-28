package com.formacionspringboot.appweb.service;

import java.util.List;

import com.formacionspringboot.appweb.entity.Empleado;

public interface EmpleadoService {

	public List<Empleado> listarTodosLosEmpleados();
	
	public Empleado guardarEmpleado(Empleado empleado);
	
	public Empleado obtenerEmpleado(Long id);
	
	public void eliminarEmpleado(Long id);
}
