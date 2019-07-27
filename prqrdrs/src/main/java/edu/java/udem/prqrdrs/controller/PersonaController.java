package edu.java.udem.prqrdrs.controller;

import edu.java.udem.prqrdrs.dto.PersonaDto;
import edu.java.udem.prqrdrs.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/personas")
public class PersonaController {

    PersonaService personaService = null;

    @Autowired
    PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    PersonaDto addPersona(@RequestBody PersonaDto personaDto) {
        return personaService.addUser(personaDto);
    }
}
