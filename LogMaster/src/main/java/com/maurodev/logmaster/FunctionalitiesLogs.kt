package com.maurodev.logmaster

interface FunctionalitiesLogs {
    fun executeErrorLog(log: String?, buildConfig: Boolean) {}
    fun executeWarningLog(log: String?, buildConfig: Boolean) {}
    fun executeSuccessLog(log: String?,  buildConfig: Boolean) {}
    fun executeDevLog(log: String?,  buildConfig: Boolean) {}
}