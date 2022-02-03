package com.example.odev_5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_a_sayfasi.*

class ASayfasiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a_sayfasi)

        buttont1.setOnClickListener {
            val intent3 = Intent(this@ASayfasiActivity,BSayfasiActivity::class.java)
            startActivity(intent3)
            finish()
        }

    }
}