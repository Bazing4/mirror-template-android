package com.bryanollivie.sdk.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.bryanollivie.sdk.data.local.entity.BookEntity
import io.reactivex.Single

@Dao
interface BookDao {

    @Query("SELECT * FROM jobs")
    fun getBooks(): Single<List<BookEntity>>

    @Transaction
    fun updateData(users: List<BookEntity>) {
        deleteAll()
        insertAll(users)
    }

    @Insert
    fun insertAll(users: List<BookEntity>)

    @Query("DELETE FROM jobs")
    fun deleteAll()
}