package com.example.tiwi.jhotel_android_pratiwi;
/**
 * java untuk lokasi hotel
 *
 * @author Pratiwi Yustiana
 * @version 08/05/2018
 */

public class Lokasi {
    private double x_coord;
    private double y_coord;
    private String deskripsi;

    public Lokasi(double x_coord, double y_coord, String deskripsi) {
        this.x_coord = x_coord;
        this.y_coord = y_coord;
        this.deskripsi = deskripsi;
    }

    /**
     * mtehod untuk mendapatkan kordinat pada sumbu x
     * @return x_coord
     */
    public double getX_coord() {
        return x_coord;
    }

    /**
     * method untuk mendapatkan kordinat pada sumbu y
     * @return y_coord
     */
    public double getY_coord() {
        return y_coord;
    }

    /**
     * method untuk mendapatkan nama lokasi
     * @return deskripsi
     */
    public String getDeskripsi() {
        return deskripsi;
    }

    /**
     * method untuk mengatur sumbu x
     * @param x_coord
     */
    public void setX_coord(double x_coord) {
        this.x_coord = x_coord;
    }

    /**
     * method untuk mengatur sumbu y
     * @param y_coord
     */
    public void setY_coord(double y_coord) {
        this.y_coord = y_coord;
    }

    /**
     * method untuk megatur nama lokasi
     * @param deskripsi
     */
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
