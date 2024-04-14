package com.maurodev.logmaster.data.local

import android.app.Application
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 * This class contains all the main functionalities
 * that the database can perform.
 *
 * Within this class you can add,
 * delete and obtain logs contained in the database.
 */
class DataBaseRepository(application: Application) {

    private val logRegisterDAO = LogRoomDataBase.getInstance(application)?.logRegisterDAO()
    private val coroutineScope = CoroutineScope(Dispatchers.IO)
    fun saveLog(logRegister: LogRegister) : Boolean {
        return true
    }

    fun deleteLogs() : Boolean{
        return true
    }

    fun obtainLogs(){
        // TODO return array with data.
    }

    fun saveLog(logRegister: LogRegister, callback: (Boolean) -> Unit) {
        coroutineScope.launch {
            val result = withContext(Dispatchers.IO) {
                logRegisterDAO?.saveLog(logRegister)
                true
            }
            callback(result)
        }
    }

    fun deleteLogs(callback: (Boolean) -> Unit) {
        coroutineScope.launch {
            val result = withContext(Dispatchers.IO) {
                logRegisterDAO?.deleteAll()
                true
            }
            callback(result)
        }
    }

    fun obtainLogs(callback: (List<LogRegister>) -> Unit) {
        coroutineScope.launch {
            val logs = withContext(Dispatchers.IO) {
                // logRegisterDAO?.getLogsInRange()
                listOf<LogRegister>() // temp
            }
            callback(logs)
        }
    }
}