package edu.java.udem.prqrdrs.service;

import edu.java.udem.prqrdrs.dao.PersonaRepository;
import edu.java.udem.prqrdrs.dto.PersonaDto;
import edu.java.udem.prqrdrs.entities.PersonaEntity;
import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author jpramirez
 */
public class PersonaServiceImpl implements PersonaService {

    PersonaRepository personaRepository;

    @Autowired
    public PersonaServiceImpl(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    private PersonaDto getDTO(PersonaEntity user) {
        ModelMapper modelMapper = new ModelMapper();
        PersonaDto dto = modelMapper.map(user, PersonaDto.class);
        return dto;
    }

    private PersonaEntity getEntity(PersonaDto user) {
        ModelMapper modelMapper = new ModelMapper();
        PersonaEntity entity = modelMapper.map(user, PersonaEntity.class);
        return entity;
    }

    @Override
    public PersonaDto addUser(PersonaDto user) {
        return this.getDTO(personaRepository.save(this.getEntity(user)));
    }

    @Override
    public void deleteUser(PersonaDto user) {
        personaRepository.delete(this.getEntity(user));
    }

    @Override
    public List<PersonaDto> getPersonas() {
        List<PersonaDto> list = new ArrayList<PersonaDto>();
        List<PersonaEntity> list2 = this.personaRepository.findAll();
        list2.stream().forEach(p -> list.add(this.getDTO(p)));

        return list;
    }

    @Override
    public PersonaDto getPersonaByLogin(String login) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
