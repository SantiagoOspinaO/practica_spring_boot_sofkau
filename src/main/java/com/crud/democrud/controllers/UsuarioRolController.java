package com.crud.democrud.controllers;

import com.crud.democrud.models.UsuarioRolModel;
import com.crud.democrud.services.UsuarioRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping("/roles")
public class UsuarioRolController {

    @Autowired
    UsuarioRolService usuarioRolService;

    @GetMapping()
    public ArrayList<UsuarioRolModel> obtenerUsuarioRoles() {
        return usuarioRolService.obtenerUsuariosRol();
    }

    @PostMapping()
    public UsuarioRolModel guardarUsuarioRol(@RequestBody UsuarioRolModel usuarioRolModel) {
        return this.usuarioRolService.guardarUsuarioRol(usuarioRolModel);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarRolPorId(@PathVariable("id") Long id) {
        boolean ok = this.usuarioRolService.eliminarUsuarioRolPorId(id);
        if (ok) {
            return "Se eliminó el rol con id " + id;
        } else {
            return "No pudo eliminar el rol con id" + id;
        }
    }
}
