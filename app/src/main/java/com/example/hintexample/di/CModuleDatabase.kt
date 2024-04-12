package com.example.hintexample.di

import android.content.Context
import androidx.room.Room
import com.example.hintexample.db.CDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

//https://stackoverflow.com/questions/63146318/how-to-create-and-use-a-room-database-in-kotlin-dagger-hilt
@Module
@InstallIn(SingletonComponent::class)
object CModuleDatabase {

    @Singleton // Tell Dagger-Hilt to create a singleton accessible everywhere in ApplicationComponent (i.e. everywhere in the application)
    @Provides
    fun provideDatabase(
        @ApplicationContext app: Context
    ) = Room.databaseBuilder(
        app,
        CDatabase::class.java,
        "database_file.db"
    ).build() // The reason we can construct a database for the repo

    @Singleton
    @Provides
    fun provideDao(
        db: CDatabase
    ) = db.userDao() // The reason we can implement a Dao for the database
}