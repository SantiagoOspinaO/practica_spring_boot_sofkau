package com.crud.democrud.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "usuario_rol")
public class UsuarioRolModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol", unique = true, nullable = false)
    private Long idRol;

    private String rol;

    @ManyToOne()
    @JoinColumn(name = "usu_id", referencedColumnName = "id")
    private UsuarioModel usuarioModel;

    public UsuarioRolModel() {
    }

    public UsuarioRolModel(Long idRol, String rol) {
        this.idRol = idRol;
        this.rol = rol;
    }
}
