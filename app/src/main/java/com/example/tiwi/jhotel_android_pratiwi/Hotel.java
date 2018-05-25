package com.example.tiwi.jhotel_android_pratiwi;

/**
 * class Hotel
 *
 * @author Pratiwi Yustiana
 * @version 08/05/2018
 */
public class Hotel {
    private int id;
    private String nama;
    private Lokasi lokasi;
    private int bintang;

    public Hotel(int id, String nama, Lokasi lokasi, int bintang){
        this.id = id;
        this.nama = nama;
        this.lokasi = lokasi;
        this.bintang = bintang;
    }

    /**
     * method untuk mendapatkan id hotel
     * @return id
     */
    public int getId() {
        return id;
    }
    /**
     * method untuk mendapatkan nama hotel
     * @return nama
     */
    public String getNama() {
        return nama;
    }
    /**
     * method untuk mendapatkan lokasi hotel
     * @return lokasi
     */
    public Lokasi getLokasi() {
        return lokasi;
    }
    /**
     * method untuk mendapatkan bintang hotel
     * @return bintang
     */
    public int getBintang() {
        return bintang;
    }
    /**
     * method untuk mengatur id hotel
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * method untuk mengatur nama hotel
     * @param nama
     */
    public void setNama(String nama) {
        this.nama = nama;
    }
    /**
     * method untuk mengatur lokasi hotel
     * @param lokasi
     */
    public void setLokasi(Lokasi lokasi) {
        this.lokasi = lokasi;
    }
    /**
     * method untuk mengatur bintang hotel
     * @param bintang
     */
    public void setBintang(int bintang) {
        this.bintang = bintang;
    }
}
