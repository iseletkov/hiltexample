package com.example.hintexample.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate
import java.util.UUID

@Entity(tableName = "users")
data class CUser (
    @PrimaryKey
    var id : UUID,
    @ColumnInfo(name = "first_name")
    var firstName : String,
    @ColumnInfo(name = "second_name")
    var secondName : String,
    @ColumnInfo(name = "date_of_birth")
    var dateOfBirth : LocalDate
)