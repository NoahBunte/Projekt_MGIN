package com.example.noah.projektarbeit_search_image_view;

public class Stadt {
    String name;
    int Einwohner; //in Millionen
    int fläche;
    int höhe;
    int[]stadtbilder;


    public Stadt(String name, int einwohner, int fläche, int höhe, int[] stadtbilder) {
        this.name = name;
        Einwohner = einwohner;
        this.fläche = fläche;
        this.höhe = höhe;
        this.stadtbilder = stadtbilder;
    }

    public Stadt() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEinwohner() {
        return Einwohner;
    }

    public void setEinwohner(int einwohner) {
        Einwohner = einwohner;
    }

    public int getFläche() {
        return fläche;
    }

    public void setFläche(int fläche) {
        this.fläche = fläche;
    }

    public int getHöhe() {
        return höhe;
    }

    public void setHöhe(int höhe) {
        this.höhe = höhe;
    }

    public int[] getStadtbilder() {
        return stadtbilder;
    }

    public void setStadtbilder(int[] stadtbilder) {
        this.stadtbilder = stadtbilder;
    }

    @Override
    public String toString() {
        return name +"";

    }
}
