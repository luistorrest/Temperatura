package com.luistorrest.mispeliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.luistorrest.mispeliculas.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {


    private lateinit var registerBinding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        registerBinding = ActivityRegisterBinding.inflate(layoutInflater)
        val view = registerBinding.root
        setContentView(view)

        registerBinding.converterButton.setOnClickListener {
            Log.d("button", "clicked")
            val email = registerBinding.CelsiusEditText.text.toString()
            registerBinding.infoTextView.text = email
            var info = registerBinding.infoTextView.text.toString()

            registerBinding.infoTextView.text =info
        }
    }
}