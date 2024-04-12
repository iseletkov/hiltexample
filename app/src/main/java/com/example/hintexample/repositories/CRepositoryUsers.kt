package com.example.hintexample.repositories

import com.example.hintexample.db.CDAOUsers
import com.example.hintexample.model.CUser
import javax.inject.Inject

class CRepositoryUsers
@Inject constructor(
    val daoUsers : CDAOUsers
)
{
    fun getAll() = daoUsers.getAll()

    suspend fun save(user : CUser)
    {
        daoUsers.insertAll(user)
    }

    suspend fun delete(user : CUser)
    {
        daoUsers.delete(user)
    }
}