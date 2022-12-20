package com.example;

public class Mess {
    String testo;               
    String chiInvia;
    String chiRiceve;
    String tipo;

    public Mess(String testo, String chiInvia, String chiRiceve, String tipo) {
        this.testo = testo;
        this.chiInvia = chiInvia;
        this.chiRiceve = chiRiceve;
        this.tipo = tipo;
    }

    public Mess(){
    }

    
    public String getTesto(){
        return testo;
    }
    public void setTesto(String testo){
        this.testo = testo;
    }
    
    public String getChiInvia(){
        return chiInvia;
    }
    public void setChiInvia(String chiInvia){
        this.chiInvia = chiInvia;
    }
    
    public String getChiRiceve(){
        return chiRiceve;
    }
    public void setChiRiceve(String chiRiceve){
        this.chiRiceve = chiRiceve;
    }
    
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
}


