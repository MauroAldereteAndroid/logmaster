package com.maurodev.logmaster

import android.util.Log

class LogMaster {

    /**
     * Esta funcion debe agregarse en todos los sitios del proyecto que debe logearse.
     */
    fun executeLog() {
        // if debug condition
    }

    /**
     * Muestra un analisis de los logs y puede exportarse en distintos lugares.
     */
    fun logsAnalytics() {
        // Mas frecuentes
        // Mas graves y frecuentes a menos
        // mas filtros...
    }

    /**
     * Muestra la visualizacion de los logs en la UI
     */
    fun showLogsUi() {}

    /**
     * Exporta los logs fuera de la app. CVS, PDF o WEB
     */
    fun exportLogs() {}

    fun obtainTestLog() = TEST_LOG

    fun showTestLog() {
        Log.i(LOG_MODULE, TEST_LOG)
    }

    companion object {
        const val TEST_LOG = "TestLog of dependence"
        const val LOG_MODULE = "LogMaster"
    }
}