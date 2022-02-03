package com.example.odev_5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // Ekranı yatay çevirince genişliyor. O kısmı yamak için:
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // tasarım ve sınıfı yukardaki sayesinde birleştiriyoruz.

        buttonm1.setOnClickListener {

            val intent1 = Intent(this@MainActivity,ASayfasiActivity::class.java)
            startActivity(intent1)
        }

        buttonm2.setOnClickListener {
            val intent2 = Intent(this@MainActivity,XSayfasiActivity::class.java)
            startActivity(intent2)

        }
    }
}