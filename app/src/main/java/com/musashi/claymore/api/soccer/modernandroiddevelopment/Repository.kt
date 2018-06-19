package com.musashi.claymore.api.soccer.modernandroiddevelopment

import android.os.Handler

class RepoModel {
    /**
     * @return a new fixed String
     */
    fun refreshData(onDataReadyCallback: OnDataReadyCallback) {
        Handler().postDelayed({ onDataReadyCallback.onDataReady("new data") },2000)
    }
}

/**
 * Callback della chiamata
 * @see RepoModel.refreshData()
 */
interface OnDataReadyCallback {
    fun onDataReady(data : String)
}