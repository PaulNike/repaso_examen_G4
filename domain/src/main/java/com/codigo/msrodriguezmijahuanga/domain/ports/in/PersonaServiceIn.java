package com.codigo.msrodriguezmijahuanga.domain.ports.in;

import com.codigo.msrodriguezmijahuanga.domain.aggregates.dto.PersonaDto;
import com.codigo.msrodriguezmijahuanga.domain.aggregates.request.PersonaRequest;

import java.util.List;
import java.util.Optional;

public interface PersonaServiceIn {

    PersonaDto crearPersonaIn(PersonaRequest personaRequest);
    Optional<PersonaDto> buscarXIdIn(Long id);
    List<PersonaDto> obtenerTodosIn();
    PersonaDto actualziarIn(Long id, PersonaRequest personaRequest);
    PersonaDto deleteIn(Long id);
}
