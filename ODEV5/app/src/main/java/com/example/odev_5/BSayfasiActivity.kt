package com.example.odev_5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_b_sayfasi.*

class BSayfasiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b_sayfasi)

        buttons1.setOnClickListener {
            val intent4 = Intent(this@BSayfasiActivity,YSayfasiActivity::class.java)
            startActivity(intent4)
            finish()
        }

    }
}