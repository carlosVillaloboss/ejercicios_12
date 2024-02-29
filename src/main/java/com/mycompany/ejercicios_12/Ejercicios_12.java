package com.mycompany.ejercicios_12;


public class Ejercicios_12 {

    public static void main(String[] args) {
        int s_bruto= 5000*48;
        double retencion= s_bruto*0.125;
        double s_neto= s_bruto-retencion;
        System.out.println("Salario bruto: "+ s_bruto );
        System.out.println("Retencion en la fuente(12.5%): "+ retencion);
        System.out.println("Salario neto: "+ s_neto);
    }
}

