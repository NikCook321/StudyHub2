package com.example.studyhub.repository

import com.example.studyhub.data.dao.UserDao
import com.example.studyhub.model.User

class UserRepository(
    private val userDao: UserDao
) {

    suspend fun registerUser(user: User) {
        userDao.insertUser(user)
    }

    suspend fun login(email: String): User? {
        return userDao.getUserByEmail(email)
    }

    suspend fun getAllUsers(): List<User> {
        return userDao.getAllUsers()
    }
}
