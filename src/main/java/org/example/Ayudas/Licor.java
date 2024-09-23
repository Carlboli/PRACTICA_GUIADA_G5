package org.example.Ayudas;
import java.time.LocalDate;
public class Licor {

    private String name;
    private  LocalDate vencimiento;
    private   Integer porcentajeAlcohol;
    private  String cantAzucar;
    private  String marca;

    public Licor(String name, LocalDate vencimiento, Integer porcentajeAlcohol, String cantAzucar, String marca) {
        this.name = name;
        this.vencimiento = vencimiento;
        this.porcentajeAlcohol = porcentajeAlcohol;
        this.cantAzucar = cantAzucar;
        this.marca = marca;
    }

    public Licor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(LocalDate vencimiento) {
        this.vencimiento = vencimiento;
    }

    public Integer getPorcentajeAlcohol() {
        return porcentajeAlcohol;
    }

    public void setPorcentajeAlcohol(Integer porcentajeAlcohol) {
        this.porcentajeAlcohol = porcentajeAlcohol;
    }

    public String getCantAzucar() {
        return cantAzucar;
    }

    public void setCantAzucar(String cantAzucar) {
        this.cantAzucar = cantAzucar;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
