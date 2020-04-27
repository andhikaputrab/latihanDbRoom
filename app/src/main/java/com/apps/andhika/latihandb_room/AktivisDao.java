package com.apps.andhika.latihandb_room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

/*
    Developed by Andhika Putra Bagaskara - 10117167 - IF5
    on 25-04-2020
 */

@Dao
public interface AktivisDao {

    @Insert
    void TambahAktivis(AktivisEntity aktivisEntity);

    @Delete
    public void HapusAktivis(AktivisEntity aktivisEntity);

    @Query("SELECT * FROM AktivisEntity")
    List<AktivisEntity>tampilSeluruhAktivis();

    @Query("SELECT * FROM AktivisEntity WHERE zonaTugas LIKE :zona")
    List<AktivisEntity>findByZone(String zona);
}
