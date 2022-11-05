package com.mitocode.modelo;

import javax.persistence.*;

@Entity
@Table(name = "paciente") //, schema = "nombreDelEsquema" // si tenemos
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPaciente;

    @Column(name = "nombres", nullable = false, length = 50)
    private String nombres;
    @Column(name = "apellidos", nullable = false, length = 50)
    private String apellidos;

    @Column(name = "dni", nullable = false, length = 50)
    private String dni;

    @Column(name = "direccion", nullable = true, length = 50)
    private String direccion;

    @Column(name = "telefono", nullable = true, length = 50)
    private String telefono;

    @Column(name = "email", nullable = true, length = 100)
    private String email;

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "idPaciente=" + idPaciente +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}