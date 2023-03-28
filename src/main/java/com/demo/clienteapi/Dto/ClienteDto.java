package com.demo.clienteapi.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDto {
    private int id;
    private String identificacion;
    private String nombre;
    private String apellidos;
    private String paisResidencia;
    private String paisNacimiento;
    private String direccion;
    private String telefono;
    private Boolean estado;
}
