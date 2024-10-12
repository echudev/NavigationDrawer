package com.ifts.navigationdrawer.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ifts.navigationdrawer.databinding.ActivityMainBinding
import android.content.Intent
import com.ifts.navigationdrawer.home.HomeActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnToHome.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}