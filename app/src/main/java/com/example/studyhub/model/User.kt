package com.example.studyhub.model

data class User(
    val id: String,
    val name: String,
    val email: String,
    val role: UserRole,
    val isEnabled: Boolean = true
)

enum class UserRole{
    ADMIN,
    STUDENT,
    GROUP_LEADER
}