package com.katheryn.native160420038.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.katheryn.native160420038.R

class LoginActivity : AppCompatActivity() {
    var user = 0
    var pass = 12345678

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

}