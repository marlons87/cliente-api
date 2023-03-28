package com.demo.clienteapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name = "cliente")
@Getter
@Setter
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String identificacion;
    @Column(name = "nombre")
    private String nombre;
    @Column(length = 30)
    private String apellidos;
    @Column(length = 30)
    private String paisResidencia;
    @Column(length = 30)
    private String paisNacimiento;
    private String direccion;
    private String telefono;
    private Boolean estado;
}
