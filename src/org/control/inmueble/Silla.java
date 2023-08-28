/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.control.inmueble;

/**
 *
 * @author USUARIO
 */
public class Silla {
    protected int numeroPatas;
    protected String color;
    protected String lugar;
    protected String fabricante;
    protected String propietario;
    protected String referencia;
    protected boolean averiada;
    public Silla(int numeroPatas, String color, String lugar, String fabricante, String propietario, String referencia, boolean averiada) {
        this.numeroPatas = numeroPatas;
        this.color = color;
        this.lugar = lugar;
        this.fabricante = fabricante;
        this.propietario = propietario;
        this.referencia = referencia;
        this.averiada = averiada;
    }
    
    public void mover(){
     
        System.out.println("Estoy en mover");
    }
    public void lavar(){
        System.out.println("Estoy en lavar");
    }
    public void limpiar(){
        System.out.println("Estoy en limpiar");
    }
    public void reparar(){
        System.out.println("Estoy en reparar");
    }
    public Silla(){   
    }
    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public boolean isAveriada() {
        return averiada;
    }

    public void setAveriada(boolean averiada) {
        this.averiada = averiada;
    }
    
}