package com.example.studyhub.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.studyhub.data.dao.UserDao
import com.example.studyhub.model.User

@Database(
    entities = [User::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(UserRoleConverter::class)
abstract class StudyHubDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao

    companion object {
        @Volatile
        private var INSTANCE: StudyHubDatabase? = null

        fun getDatabase(context: Context): StudyHubDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    StudyHubDatabase::class.java,
                    "studyhub_database"
                ).build()

                INSTANCE = instance
                instance
            }
        }
    }
}
