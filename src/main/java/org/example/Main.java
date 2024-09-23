package org.example;

import org.example.Ayudas.Licor;
import org.example.Modelos.Cliente;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Licor licor1 = new Licor();
        Licor licor2 = new Licor("Crema de whisky", LocalDate.of(2030,10,20),15,"2.3%","Weddneas");

        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente("carlos","10345332443",20,20000000,"medellin");

        System.out.println(licor1.getName());
        System.out.println(licor2.getName());

    }
}