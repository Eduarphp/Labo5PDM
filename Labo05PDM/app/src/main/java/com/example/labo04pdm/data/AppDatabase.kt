package com.example.labo04pdm.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.labo04pdm.model.Task

@Database(entities = [Task::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun taskDao(): TaskDao
}
