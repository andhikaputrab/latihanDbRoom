package com.apps.andhika.latihandb_room;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/*
    Developed by Andhika Putra Bagaskara - 10117167 - IF5
    on 25-04-2020
 */

public class MainActivity extends AppCompatActivity {

    private AktivisEntity aktivisEntity;
    public static AppDatabase db;

    //Attribut untuk mendisplay hasil data
    List<AktivisEntity> aktivisEntities = new ArrayList<>();
    List<AktivisEntity> aktivisEntityListByZone = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "Aktivis")
                .allowMainThreadQueries().build();

        //TAMBAH DATA
        aktivisEntity = new AktivisEntity();
        aktivisEntity.setNamaAktivis("Novita Sari");
        aktivisEntity.setEmailAktivis("novi@gmail.com");
        aktivisEntity.setZonaTugas("Jakarta");

        Log.d("TAMBAH", "Tambah Data Aktivis");
        Log.d("TAMBAH", "===================");
        Log.d("TAMBAH", "Nama : "+aktivisEntity.getNamaAktivis());
        Log.d("TAMBAH", "Email : "+aktivisEntity.getEmailAktivis());
        Log.d("TAMBAH", "Zona : "+aktivisEntity.getZonaTugas());

        db.aktivisDao().TambahAktivis(aktivisEntity);

        //TAMPIL SELURUH DATA
        Log.d("TAMPIL", "TAMPIL SELURUH DATA");
        Log.d("TAMPIL", "===================");

        aktivisEntities = db.aktivisDao().tampilSeluruhAktivis();

        for (int i = 0; i<aktivisEntities.size(); i++){
            Log.d("TAMPIL", "Data Ke-"+(i+1));
            Log.d("TAMPIL", "Nama : "+aktivisEntities.get(i).getNamaAktivis());
            Log.d("TAMPIL", "Email : "+aktivisEntities.get(i).getEmailAktivis());
            Log.d("TAMPIL", "Zona : "+aktivisEntities.get(i).getZonaTugas());
            Log.d("TAMPIL", "===================");
        }

        //TAMPIL BERDASARKAN ZONA
        Log.e("ZONE", "Data Aktivis Berdasarkan Zona");
        Log.e("ZONE", "=============================");

        aktivisEntityListByZone = db.aktivisDao().findByZone("Jakarta");

        for (int i = 0; i<aktivisEntityListByZone.size(); i++){
            Log.e("ZONE", "Data Ke-"+(i+1));
            Log.e("ZONE", aktivisEntityListByZone.get(i).getNamaAktivis());
            Log.e("ZONE", aktivisEntityListByZone.get(i).getEmailAktivis());
            Log.e("ZONE", aktivisEntityListByZone.get(i).getZonaTugas());
            Log.e("ZONE", "=============================");
        }
    }
}