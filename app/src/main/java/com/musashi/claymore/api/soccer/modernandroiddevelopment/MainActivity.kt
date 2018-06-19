package com.musashi.claymore.api.soccer.modernandroiddevelopment

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.musashi.claymore.api.soccer.modernandroiddevelopment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var viewModel=MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // inizializza il databinding
        binding=DataBindingUtil.setContentView(this, R.layout.activity_main)
        // assegna il viewmodel dichiarato nell'xml che ora estende ViewModel
        // non stiamo creando un nuova istanza perchè lo prendiamo da ViewModelProviders
        // e vive fino a quando OnDestroy() non viene chiamato
        binding.viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        // esegue il binding
        binding.executePendingBindings()


    }
}
