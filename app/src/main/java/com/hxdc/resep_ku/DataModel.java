package com.hxdc.resep_ku;

import java.io.Serializable;

public class DataModel implements Serializable {
    Integer viewType;
    String judul, konten;

    public String getKonten() {
        return konten;
    }

    public void setKonten(String konten) {
        this.konten = konten;
    }

    public String getJudul() {

        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public Integer getViewType() {
        return viewType;
    }

    public void setViewType(Integer viewType) {
        this.viewType = viewType;
    }
}
