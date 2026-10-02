package com.example.studyhub.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.studyhub.model.User

@Dao
interface UserDao {

    @Insert
    suspend fun insertUser(user: User)

    @Query("SELECT * FROM users WHERE email = :email LIMIT 1")
    suspend fun getUserByEmail(email: String): User?

    @Query("SELECT * FROM users")
    suspend fun getAllUsers(): List<User>
}
