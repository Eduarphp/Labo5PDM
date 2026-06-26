package com.example.labo04pdm

import android.app.Application
import androidx.room.Room
import com.example.labo04pdm.data.AppDatabase

class TaskApplication : Application() {

    companion object {
        lateinit var database: AppDatabase
    }

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(
            this,
            AppDatabase::class.java,
            "TaskDatabase"
        ).fallbackToDestructiveMigration(false)
            .build()
    }
}
