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
            val Celsius = registerBinding.CelsiusEditText.text.toString()

            var kelvin = Celsius.toFloat() + 273.15

            registerBinding.infoTextView.text = kelvin.toString()
            var info = registerBinding.infoTextView.text.toString()
            registerBinding.infoTextView.text =info
            Toast.makeText(this,"Se ha convertido los grados a kelvin",Toast.LENGTH_LONG).show()
        }
    }
}