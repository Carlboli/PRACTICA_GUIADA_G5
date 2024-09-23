package org.example.Modelos;

public class Cliente {

    private String nombre;
    private  String cedula;
    private Integer edad;
    private  Integer saldoCuenta;
    private String ciudad;

    public Cliente(String nombre, String cedula, Integer edad, Integer saldoCuenta, String ciudad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.saldoCuenta = saldoCuenta;
        this.ciudad = ciudad;
    }

    public Cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(Integer saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
