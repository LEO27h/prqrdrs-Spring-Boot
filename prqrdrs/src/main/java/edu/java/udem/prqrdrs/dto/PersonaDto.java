
package edu.java.udem.prqrdrs.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class PersonaDto {

    private Long id;
    private String login;
    private String email;
    private String password;
    private String name;
    private String apellido;
}
