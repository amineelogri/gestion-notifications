package com.nomApplication.controlleur;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notifications")
public class NomControlleur {
/**
 * chaque methode doit etre commentée:
 * nom de la methode 
 * son type (GET, POST....)
 * type de retour
 * son role
 */
	@RequestMapping(value="/nomMethode", method=RequestMethod.GET)
	
	public ResponseEntity<String> nomMethode(){
		return new ResponseEntity<String>("hello world Controller notifications", HttpStatus.OK);
	}
}
