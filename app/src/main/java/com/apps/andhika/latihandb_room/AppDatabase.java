package com.apps.andhika.latihandb_room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

/*
    Developed by Andhika Putra Bagaskara - 10117167 - IF5
    on 25-04-2020
 */

@Database(entities = {AktivisEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract AktivisDao aktivisDao();
}
