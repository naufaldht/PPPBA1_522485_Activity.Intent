package com.example.pertemuan_5

import android.app.Activity
import android.os.Bundle
import android.content.Intent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.pertemuan_5.databinding.LoginActivityBinding

class LoginActivity : AppCompatActivity(){
    private lateinit var  binding: LoginActivityBinding
    companion object{
        const val User_Username = "User Username"
        const val User_Phone = "User Phone"
        const val User_Email = "User Email"
        const val User_Password = "User Password"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val usernameReg = intent.getStringExtra(User_Username)
        val passwordReg = intent.getStringExtra(User_Password)
        val emailReg = intent.getStringExtra(User_Email)
        val phoneReg = intent.getStringExtra(User_Phone)

        with(binding){
            loginButton.setOnClickListener{
                val Username_login = usernameLogin.text.toString()
                val Password_login = passwordLogin.text.toString()

                if (usernameReg == Username_login && passwordReg == Password_login) {
                    val intentToThirdActivity = Intent(this@LoginActivity,HomepageActivity::class.java)
                    intentToThirdActivity.putExtra(User_Username,usernameReg.toString())
                    intentToThirdActivity.putExtra(User_Email,emailReg.toString())
                    intentToThirdActivity.putExtra(User_Phone,phoneReg.toString())

                    startActivity((intentToThirdActivity))
                } else {
                    txtWarning.text = "wrong password or username !"
                }
            }
        }
    }
}