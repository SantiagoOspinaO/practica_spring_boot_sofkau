package com.crud.democrud.ServicesTest;

import com.crud.democrud.models.UsuarioRolModel;
import com.crud.democrud.repositories.UsuarioRolRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
public class UsuarioRolTest {
    @Autowired
    UsuarioRolRepository usuarioRolRepository;

    @Test
    public void testBuscarUsuarioRolPorId(){
        Long idABuscar=1L;
        Optional<UsuarioRolModel> buscarPorUsuarioRol = usuarioRolRepository.findById(idABuscar);
        assertThat(buscarPorUsuarioRol.get().getIdRol()).isEqualTo(idABuscar);
    }
}
