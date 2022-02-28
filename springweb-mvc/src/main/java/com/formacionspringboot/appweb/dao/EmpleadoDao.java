package com.formacionspringboot.appweb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formacionspringboot.appweb.entity.Empleado;

@Repository
public interface EmpleadoDao extends JpaRepository<Empleado,Long>{

}
