package com.iswan.main.myweatherapp.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.iswan.main.myweatherapp.R
import com.iswan.main.myweatherapp.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root)
    }
}