package com.microservicios.usuarios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.microservicios.usuarios.service.AlumnoService;

@Controller
@RequestMapping("/alumnos")
public class AlumnoController {
	
	@Autowired
	AlumnoService AlumnoService;
	
	
	
}
