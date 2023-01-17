package com.example.game4u

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

         minion_btn.setOnClickListener {
            val intent = Intent(this, installActivity4::class.java)
            startActivity(intent)
        }

        jetpack_btn.setOnClickListener {
            val intent = Intent(this, installActivity3::class.java)
            startActivity(intent)
        }

        subway_btn.setOnClickListener {
                val intent = Intent(this, installActivity1::class.java)
                startActivity(intent)
        }

        jumanj_btn.setOnClickListener {
            val intent = Intent(this, installActivity2::class.java)
            startActivity(intent)
        }
    }
}