package com.example.hintexample.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.hintexample.model.CUser


@Database(entities = [CUser::class], version = 1)
@TypeConverters(CConverters::class)
abstract class CDatabase : RoomDatabase() {
    abstract fun userDao(): CDAOUsers

}