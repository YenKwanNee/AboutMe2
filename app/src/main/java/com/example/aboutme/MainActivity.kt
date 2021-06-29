package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnDone : Button = findViewById(R.id.done_button)

        btnDone.setOnClickListener(){
            val tvResult : TextView = findViewById(R.id.tvResult)
            val tvNickname : TextView = findViewById(R.id.nickname_edit)

            tvResult.text = tvNickname.text.toString()


            tvResult.visibility = View.VISIBLE
            btnDone.visibility = View.GONE
            tvNickname.visibility = View.GONE
        }
    }
}