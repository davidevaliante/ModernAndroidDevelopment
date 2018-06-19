package com.musashi.claymore.api.soccer.modernandroiddevelopment

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
        // assegna il viewmodel dichiarato nell'xml
        binding.viewModel = viewModel
        // esegue il binding
        binding.executePendingBindings()


    }
}
