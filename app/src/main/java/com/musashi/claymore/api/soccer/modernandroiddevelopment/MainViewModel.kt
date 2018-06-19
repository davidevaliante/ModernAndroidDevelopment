package com.musashi.claymore.api.soccer.modernandroiddevelopment

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableField

class MainViewModel : ViewModel() {
    val repoModel: RepoModel = RepoModel()
    // observable field appartiene alla library di Databinding
    val text = ObservableField("Old data")
    val isLoading = ObservableField(false)


    /**
     * finge richiesta al server
     * @see RepoModel.refreshData
     */
    fun refresh(){
        // se un field è osservabile i valori vanno cambiati con set(), in compenso possono essere val
        isLoading.set(true)
        repoModel.refreshData(object : OnDataReadyCallback{
            override fun onDataReady(data: String) {
                isLoading.set(false)
                text.set(data)
            }
        })
    }

}