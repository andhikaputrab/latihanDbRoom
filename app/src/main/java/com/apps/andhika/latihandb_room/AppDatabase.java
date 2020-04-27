package com.apps.andhika.latihandb_room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {AktivisEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract AktivisDao aktivisDao();
}