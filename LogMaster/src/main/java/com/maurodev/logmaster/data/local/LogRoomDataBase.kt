package com.maurodev.logmaster.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [LogRegister::class], version = 1)
abstract class LogRoomDataBase : RoomDatabase() {

    abstract fun logRegisterDAO(): LogRegisterDAO

    companion object {
        private const val DATABASE_NAME = "logs_database"

        @Volatile
        private var INSTANCE: LogRoomDataBase? = null

        fun getInstance(context: Context): LogRoomDataBase? {
            INSTANCE ?: synchronized(this) {
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    LogRoomDataBase::class.java,
                    DATABASE_NAME
                ).build()
            }
            return INSTANCE
        }
    }
}