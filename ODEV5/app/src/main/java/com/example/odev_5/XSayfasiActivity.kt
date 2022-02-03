package com.example.odev_5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_x_sayfasi.*

class XSayfasiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_x_sayfasi)

        buttong1.setOnClickListener {
            val intent5 = Intent(this@XSayfasiActivity,YSayfasiActivity::class.java)
            startActivity(intent5)
            finish()
        }
    }
}