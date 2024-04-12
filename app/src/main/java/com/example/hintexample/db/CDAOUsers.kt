package com.example.hintexample.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.hintexample.model.CUser
import kotlinx.coroutines.flow.Flow


@Dao
interface CDAOUsers {
    @Query("SELECT * FROM users")
    fun getAll(): Flow<List<CUser>>

    @Insert
    suspend fun insertAll(vararg users: CUser)

    @Delete
    suspend fun delete(user: CUser)
}