package com.microservicios.usuarios.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.microservicios.usuarios.entity.Alumno;
import com.microservicios.usuarios.repository.AlumnosRepository;


@Service
public class AlumnoService {
	@Autowired
	private AlumnosRepository AlumnoRepo;

	@Transactional(readOnly = true)
	public Alumno getAlumnoById(Integer id) {
		return AlumnoRepo.getOne(id);
	}
	
	@Transactional(readOnly = true)
	public Iterable<Alumno> findAll(){
		return AlumnoRepo.findAll();
	}
	
	@Transactional
	public Alumno saveAlumno(Alumno alumno) {
		return AlumnoRepo.save(alumno);
	}
	
	public void deleteAlumno(Alumno alumno) {
		AlumnoRepo.delete(alumno);
	}
	
}
