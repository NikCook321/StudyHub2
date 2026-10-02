package com.example.studyhub.data.database

import androidx.room.TypeConverter
import com.example.studyhub.model.UserRole

class UserRoleConverter {

    @TypeConverter
    fun fromUserRole(role: UserRole): String {
        return role.name
    }

    @TypeConverter
    fun toUserRole(value: String): UserRole {
        return UserRole.valueOf(value)
    }
}
