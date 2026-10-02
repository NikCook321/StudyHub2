package com.example.studyhub.data.database

import androidx.room.Database
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
}
