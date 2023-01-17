package com.example.game4u

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        popup.setOnClickListener {
            popup.visibility = View.INVISIBLE
        }
        var checker = intent.getIntExtra("checker", 0)
        if (checker == 1) {
            popup.visibility = View.INVISIBLE
        }

        log_button.setOnClickListener {
            val intent= Intent(this, MainActivity2::class.java)
            startActivity(intent)

        }

    }
}