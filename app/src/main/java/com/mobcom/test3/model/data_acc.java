package com.mobcom.test3.model;

public class data_acc {

    private String nama;
    private String harga;
    private String toko;
    private String key;
    private String user;
    private String username;
    private String napem;
    private String lokasi;
    private String usernow;
    private String jumblah;
    private String status;
    public String getUsernow() {
        return usernow;
    }

    public void setUsernow(String usernow) {
        this.usernow = usernow;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getJumblah() {
        return jumblah;
    }

    public void setJumblah(String jumblah) {
        this.jumblah = jumblah;
    }


    public String getNamapem() {
        return napem;
    }

    public void setNamapem(String napem) {
        this.napem = napem;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getToko() {
        return toko;
    }

    public void setToko(String toko) {
        this.toko = toko;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga () {
        return harga;
    }

    public void setHarga(String harga ) {
        this.harga = harga ;
    }

    public String getUser () {
        return user;
    }

    public void setUser(String user ) {
        this.user = user ;
    }

    //Membuat Konstuktor kosong untuk membaca data snapshot
    public data_acc(){
    }

    //Konstruktor dengan beberapa parameter, untuk mendapatkan Input Data dari User
    public data_acc(String harga, String lokasi, String nama, String napem, String toko, String username, String usernow, String jumblah,String status) {
        this.harga=harga;
        this.lokasi=lokasi;
        this.nama=nama;
        this.napem=napem;
        this.toko=toko;
        this.username=username;
        this.usernow=usernow;
        this.jumblah=jumblah;
        this.status=status;




    }


}

