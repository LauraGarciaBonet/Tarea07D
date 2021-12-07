package com.springboot.tarea07d.models.dao;

import org.springframework.data.repository.CrudRepository;
import com.springboot.tarea07d.models.entity.Alumno;


public interface AlumnoDao extends CrudRepository<Alumno, Long>{

}
