package com.springboot.tarea07d.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.tarea07d.models.entity.Alumno;
import com.springboot.tarea07d.models.service.AlumnoService;


@RestController
@RequestMapping("/api")
public class AlumnoRestController {

	@Autowired
	private AlumnoService alumnoService;
	
	@GetMapping("/alumnos")
	public List<Alumno> index() {
		return alumnoService.findAll();
	}
	
	@GetMapping("/alumnos/{id}")
	public ResponseEntity<?>show(@PathVariable Long id){
		Alumno alumno= null;
		Map<String,Object> response= new HashMap<>();
		
		try {
			alumno= alumnoService.findById(id);
		} catch (DataAccessException e) {
			response.put("mensaje","Error al realizar consulta en base de datos");
			response.put("error", e.getMessage().concat(":").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		if(alumno==null) {
			response.put("mensaje", "El alumno ID: ".concat(id.toString().concat(" no existe en la base de datos")));
			return new ResponseEntity<Map<String, Object>>(response,HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Alumno>(alumno,HttpStatus.OK);
	}
	
	@PostMapping("/alumnos")
	public ResponseEntity<?>create(@RequestBody Alumno alumno){
		Alumno alumnoNew=null;
		Map<String, Object> response= new HashMap<>();
		
		try {
			alumnoNew= alumnoService.save(alumno);
		} catch (DataAccessException e) {
			response.put("mensaje", "Error al realizar insert en base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		response.put("mensaje","El alumno ha sido creado con éxito!");
		response.put("alumno", alumnoNew);
		return new ResponseEntity<Map<String, Object>>(response,HttpStatus.CREATED);
	}
	
	@PutMapping("/alumnos/{id}")
	public ResponseEntity<?> update(@RequestBody Alumno alumno, @PathVariable Long id){
		Alumno alumnoActual=alumnoService.findById(id);
		
		Alumno alumnoUpdate=null;
		Map<String,Object> response= new HashMap<>();
		
		if(alumnoActual==null) {
			response.put("mensaje","Error: no se pudo editar, el alumno ID: ".concat(id.toString().concat("no existe el id en la base de datos")));
			return new ResponseEntity<Map<String, Object>>(response,HttpStatus.NOT_FOUND);
		}
		
		try {
			alumnoActual.setApellido(alumno.getApellido());
			alumnoActual.setNombre(alumno.getNombre());
			alumnoActual.setEmail(alumno.getEmail());
			alumnoActual.setTelefono(alumno.getTelefono());
		
			alumnoUpdate=alumnoService.save(alumnoActual);
		} catch (DataAccessException e){
			response.put("mensaje","Error al actualizar el alumno en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		response.put("mensaje","El alumno ha sido creado con éxito!");
		response.put("alumno", alumnoUpdate);
		return new ResponseEntity<Map<String, Object>>(response,HttpStatus.CREATED);
	}
	
	@DeleteMapping("alumnos/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id){
		Map<String,Object> response= new HashMap<>();
		
		try {
			alumnoService.delete(id);
		} catch (DataAccessException e) {
			response.put("mensaje","Error al eliminar el alumno en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		response.put("mensaje", "El alumno ha sido eliminado con éxito");
		
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}
}
