package com.bryanollivie.sdk.data.local
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.bryanollivie.sdk.data.local.dao.BookDao
import com.bryanollivie.sdk.data.local.entity.BookEntity


@Database(version = 1, entities = [BookEntity::class])
abstract class InitDataBase : RoomDatabase() {

    abstract fun jobsDao(): BookDao

    companion object {
        fun createDataBase(context: Context) : BookDao {
            return Room
                    .databaseBuilder(context, InitDataBase::class.java, "example.db")
                    .build()
                    .jobsDao()
        }
    }
}
