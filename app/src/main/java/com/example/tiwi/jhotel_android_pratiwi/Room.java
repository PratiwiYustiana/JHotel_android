package com.example.tiwi.jhotel_android_pratiwi;

/**
 * java untuk room
 *
 * @author Pratiwi Yustiana
 * @version 08/05/2018
 */
public class Room {
    private String roomNumber;
    private String statusKamar;
    private double dailyTariff;
    private String tipeKamar;

    public Room(String roomNumber, String statusKamar, double dailyTariff, String tipeKamar){
        this.roomNumber = roomNumber;
        this.statusKamar = statusKamar;
        this.dailyTariff = dailyTariff;
        this.tipeKamar = tipeKamar;
    }

    /**
     * method untuk mengambil nomor kamar
     * @return roomNumber
     */
    public String getRoomNumber() {
        return roomNumber;
    }

    /**
     * method untuk mengambil status kamar
     * @return statusKamar
     */
    public String getStatusKamar() {
        return statusKamar;
    }

    /**
     * method untuk mengambil harga kamar per hari
     * @return dailyTariff
     */
    public double getDailyTariff() {
        return dailyTariff;
    }

    /**
     * method untuk mengambil tipe kamar
     * @return
     */
    public String getTipeKamar() {
        return tipeKamar;
    }

    /**
     * method untuk mengatur nomor kamar
     * @param roomNumber
     */
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    /**
     * method untuk mengatur status kamar
     * @param statusKamar
     */
    public void setStatusKamar(String statusKamar) {
        this.statusKamar = statusKamar;
    }

    /**
     * method untuk mengatur harga kamar per hari
     * @param dailyTariff
     */
    public void setDailyTariff(double dailyTariff) {
        this.dailyTariff = dailyTariff;
    }

    /**
     * method untuk mengatur tipe kamar
     * @param tipeKamar
     */
    public void setTipeKamar(String tipeKamar) {
        this.tipeKamar = tipeKamar;
    }
}
