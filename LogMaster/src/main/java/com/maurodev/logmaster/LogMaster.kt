package com.maurodev.logmaster

import android.util.Log
import com.maurodev.logmaster.analytics.AnalyticsLog

class LogMaster: FunctionalitiesLogs {


    /**
     * Importante :
     *
     * Esta clase contiene
     *
     * Funciones de logeo. public
     *
     * Envio de registros a la parte de analisis. private
     *
     *
     * Mostrar al usuario los logs. public
     *
     * Permitir exportar los logs. public
     *
     *
     */

    private var analyticsLog: AnalyticsLog? = null
    private var showLog = null

    /**
     * Funciones para ejecutar un log desde un repositorio externo!
     */
    override fun executeErrorLog(log: String?, buildConfig: Boolean) {
        // temp test
        Log.e(LOG_MASTER_ERROR, log?: LOG_MASTER_EMPTY)
    }
    override fun executeWarningLog(log: String?, buildConfig: Boolean) {
        // temp test
        Log.e(LOG_MASTER_WARNING, log?: LOG_MASTER_EMPTY)
    }
    override fun executeSuccessLog(log: String?,  buildConfig: Boolean) {
        // temp test
        Log.e(LOG_MASTER_SUCCESS, log?: LOG_MASTER_EMPTY)
    }
    override fun executeDevLog(log: String?,  buildConfig: Boolean) {
        // temp test
        Log.d(LOG_MASTER_DEV, log?: LOG_MASTER_EMPTY)
    }


    /**
     * Esta funcion deberia ser inaccessible para el usuario y debe ser la encargada de logear y guardar toda la informacion necesaria.
     */
    private fun logsAnalytics() {
        analyticsLog = AnalyticsLog() //Instance
        // Mas frecuentes
        // Mas graves y frecuentes a menos
        // mas filtros...
    }

    /**
     * Muestra los logs
     */
    fun showLogs() {}

    /**
     * Exporta los logs fuera de la app. CVS, PDF o WEB
     */
    fun exportLogs() {}

    companion object {
        private const val LOG_MASTER_ERROR = "LOG_MASTER_ERROR"
        private const val LOG_MASTER_EMPTY = "Empty log, please add useful information. "
        private const val LOG_MASTER_WARNING = "LOG_MASTER_WARNING"
        private const val LOG_MASTER_SUCCESS = "LOG_MASTER_SUCCESS"
        private const val LOG_MASTER_DEV = "LOG_MASTER_DEV"
    }
}