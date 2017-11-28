package cl.restservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {
	
	private static Logger log = LoggerFactory.getLogger(Saludo.class);	

	 @RequestMapping(value = "/saludo")
	 public String saludar() {
		 
		 String saludo = "Hola Mundo";
	 	 
		 log.info("Saludo.saludar(): " + saludo);			 
	 	 
		 return saludo;
		 
	 }
	 
}
