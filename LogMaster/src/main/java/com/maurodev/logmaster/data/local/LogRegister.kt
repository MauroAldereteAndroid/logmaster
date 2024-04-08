package com.maurodev.logmaster.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "log_register")
data class LogRegister(

    @PrimaryKey(autoGenerate = true)

    /**
     * This value contains the log type. For example debug, info, etc.
     */
    @ColumnInfo(name = "type") val typeLog: String,

    /**
     * This value contains the log.
     */
    @ColumnInfo(name = "content") val contentLog: String,

    /**
     * This value contains the log timestamp.
     */
    @ColumnInfo(name = "time") val timeLog: Long,
)
