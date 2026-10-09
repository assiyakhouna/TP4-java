
package com.example.tp;

public class Complexe {
    private double reel;
    private double imaginaire;

    public Complexe(double reel, double imaginaire) {
        this.reel = reel;
        this.imaginaire = imaginaire;
    }

    public Complexe plus(Complexe c) {
        return new Complexe(
            this.reel + c.reel,
            this.imaginaire + c.imaginaire
        );
    }

    public Complexe moins(Complexe c) {
        return new Complexe(
            this.reel - c.reel,
            this.imaginaire - c.imaginaire
        );
    }

    
    public String toString() {
        if (imaginaire >= 0) {
            return reel + " +" + imaginaire + "i";
        } else {
            return reel + " " + imaginaire + "i";
        }
    }
}