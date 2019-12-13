package com.bryanollivie.sdk.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "jobs")
data class BookEntity(

        @PrimaryKey(autoGenerate = true)
        var id: Int = 0,
        val title: String = "",
        val author: String = "",
        val description: String = ""

)