package com.microservicios.usuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.microservicios.usuarios.entity.Alumno;

public interface AlumnosRepository extends CrudRepository<Alumno,Integer>,JpaRepository<Alumno, Integer> {

}
