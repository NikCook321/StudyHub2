package com.example.studyhub.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class User(
    @PrimaryKey
    val id: String,
    val name: String,
    val email: String,
    val role: UserRole,
    val isEnabled: Boolean = true
)

enum class UserRole {
    ADMIN,
    STUDENT,
    GROUP_LEADER
}
