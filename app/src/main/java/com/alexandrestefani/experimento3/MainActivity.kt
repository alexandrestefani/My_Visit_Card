package com.alexandrestefani.experimento3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tela = findViewById<ConstraintLayout>(R.id.tela)
        tela.background =getDrawable(R.drawable.phone_cardpresentation_4)
    }
}