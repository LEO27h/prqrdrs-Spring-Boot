package edu.java.udem.prqrdrs.dao;

import edu.java.udem.prqrdrs.entities.PersonaEntity;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author jpramirez
 */
@Transactional
public interface PersonaRepository extends JpaRepository<PersonaEntity, Long> {
    PersonaEntity findByLogin(String login);
}