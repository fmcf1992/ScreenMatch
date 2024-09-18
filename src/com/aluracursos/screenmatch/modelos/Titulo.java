package com.aluracursos.screenmatch.modelos;

public class Titulo {
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluacione;
    private int totalDeLasEvaluaciones;

    //SET ATRIBUTOS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    //GET ATRIBUTOS
    public int getTotalDeLasEvaluaciones(){
        return totalDeLasEvaluaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void muestraFichaTecnica(){
        System.out.println("Mi pelicula es          : " + nombre);
        System.out.println("Fecha de lanzamiento    : " + fechaDeLanzamiento);
        System.out.println("Tiempo de duracion      : " + duracionEnMinutos +" minutos");
    }
    public void evalua(double nota){
        sumaDeLasEvaluacione += nota;
        totalDeLasEvaluaciones++;
    }
    public double calculaMedia(){
        return sumaDeLasEvaluacione/totalDeLasEvaluaciones;
    }

}
