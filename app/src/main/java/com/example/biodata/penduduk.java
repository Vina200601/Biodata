package com.example.biodata;

import java.io.Serializable;
import java.util.List;

public class penduduk implements Serializable {
    private String nama_desa;
    private String nama_kades;
    private String luas_area;
    private List<String>potensi_wisata;
    private String jml_penduduk;

    public String getNama_desa() {
        return nama_desa;
    }

    public void setNama_desa(String nama_desa) {
        this.nama_desa = nama_desa;
    }

    public String getNama_kades() {
        return nama_kades;
    }

    public void setNama_kades(String nama_kades) {
        this.nama_kades = nama_kades;
    }

    public String getLuas_area() {
        return luas_area;
    }

    public void setLuas_area(String luas_area) {
        this.luas_area = luas_area;
    }

    public List<String> getPotensi_wisata() {
        return potensi_wisata;
    }

    public void setPotensi_wisata(List<String> potensi_wisata) {
        this.potensi_wisata = potensi_wisata;
    }

    public String getJml_penduduk() {
        return jml_penduduk;
    }

    public void setJml_penduduk(String jml_penduduk) {
        this.jml_penduduk = jml_penduduk;
    }
}
