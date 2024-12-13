package com.example.pertemuan_5

import android.app.Activity
import android.os.Bundle
import android.content.Intent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.pertemuan_5.databinding.ActivityRegisterBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    companion object{
        const val User_Username = "User Username"
        const val User_Phone = "User Phone"
        const val User_Email = "User Email"
        const val User_Password = "User Password"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            registerButton.setOnClickListener{
                val IntentSecondActivity = Intent(this@MainActivity, LoginActivity::class.java)
                IntentSecondActivity.putExtra(User_Username, username.text.toString())
                IntentSecondActivity.putExtra(User_Email, email.text.toString())
                IntentSecondActivity.putExtra(User_Phone, phone.text.toString())
                IntentSecondActivity.putExtra(User_Password, password.text.toString())
                startActivity(IntentSecondActivity)
            }
        }
    }
}