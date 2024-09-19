package com.aluracursos.screenmatch.calculo;

import com.aluracursos.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {
    private  int tiempoToral;

    public void incluye(Titulo titulo) {
        this.tiempoToral += titulo.getDuracionEnMinutos();
    }

    public int getTiempoToral() {
        return tiempoToral;
    }
}
