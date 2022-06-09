package com.crud.democrud.models;

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

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "usu_id", nullable = false)
    private UsuarioModel usuarioModel;

    public UsuarioRolModel() {
    }

    public UsuarioRolModel(Long idRol, String rol) {
        this.idRol = idRol;
        this.rol = rol;
    }
}
