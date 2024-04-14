package com.maurodev.logmaster.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface LogRegisterDAO {

    /**
     * This function saves a log.
     *
     * @param logRegister Receives the entity of the table.
     */
    @Insert
    fun saveLog(logRegister: LogRegister)

    /**
     * This function deletes all saved logs.
     *
     * @param logRegister Receives the entity of the table.
     */
    @Delete
    fun deleteAll(vararg logRegister: LogRegister)

    /**
     * This function receives all the logs that occur in
     * the time period sent in the parameters.
     *
     * @param startTime Start of time where we are going to capture logs.
     * @param endTime End of time where we are going to capture logs.
     */
    @Query("SELECT * FROM log_register WHERE log_register.time BETWEEN :startTime AND :endTime")
    fun getLogsInRange(startTime: Long, endTime: Long): LiveData<List<LogRegister>>

}