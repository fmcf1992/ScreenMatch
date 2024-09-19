package com.aluracursos.screenmatch.calculo;

public class FiltroRecomendacion {
    public void filtro(Clasificacion clasificacion){
        if (clasificacion.getClasificacion() >= 4){
            System.out.println("Muy bien evaluado en el momento");
        } else if (clasificacion.getClasificacion() >= 2){
            System.out.println("Popular en el momemto");
        } else {
            System.out.println("Colocalo en tu lista de espera.");
        }
    }
}
