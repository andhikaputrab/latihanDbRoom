package com.apps.andhika.latihandb_room;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/*
    Developed by Andhika Putra Bagaskara - 10117167 - IF5
    on 25-04-2020
 */

@Entity
public class AktivisEntity {

    @PrimaryKey(autoGenerate = true)
    private int idAktivis;
    @ColumnInfo(name = "namaAktivis")
    private String namaAktivis;
    @ColumnInfo(name = "emailAktivis")
    private String emailAktivis;
    @ColumnInfo(name = "zonaTugas")
    private String zonaTugas;

    public int getIdAktivis(){
        return idAktivis;
    }
    public void setIdAktivis(int idAktivis){
        this.idAktivis = idAktivis;
    }

    public String getNamaAktivis(){
        return namaAktivis;
    }
    public void setNamaAktivis(String namaAktivis){
        this.namaAktivis = namaAktivis;
    }

    public String getEmailAktivis(){
        return emailAktivis;
    }
    public void setEmailAktivis(String emailAktivis){
        this.emailAktivis = emailAktivis;
    }

    public String getZonaTugas(){
        return zonaTugas;
    }
    public void setZonaTugas(String zonaTugas){
        this.zonaTugas = zonaTugas;
    }
}
