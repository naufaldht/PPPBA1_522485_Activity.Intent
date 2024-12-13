package com.example.pertemuan_5

import android.app.Activity
import android.os.Bundle
import android.content.Intent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.pertemuan_5.databinding.HomepageBinding
import com.example.pertemuan_5.databinding.LoginActivityBinding

class HomepageActivity : AppCompatActivity(){
    private lateinit var binding: HomepageBinding
    companion object{
        const val User_Username = "User Username"
        const val User_Phone = "User Phone"
        const val User_Email = "User Email"
        const val User_Password = "User Password"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HomepageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra(User_Username)
        val email = intent.getStringExtra(User_Email)
        val phone = intent.getStringExtra(User_Phone)

        with(binding) {
            binding.usernameHome.text = username
            binding.emailHome.text = "Your email    : ($email)"
            binding.phoneHome.text = "Your phone    : ($phone)"
        }
    }
}