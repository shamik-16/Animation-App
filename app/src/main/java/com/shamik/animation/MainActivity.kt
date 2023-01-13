package com.shamik.animation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_alpha.setOnClickListener{
            startActivity(Intent(this@MainActivity,Alpha_Activity::class.java))
        }
        btn_translate.setOnClickListener {
            startActivity(Intent(this@MainActivity,Translate_Activity::class.java))
        }
        btn_rotation.setOnClickListener {
            startActivity(Intent(this@MainActivity,Rotation_Activity::class.java))
        }
        btn_scale.setOnClickListener {
            startActivity(Intent(this@MainActivity,Scale_Activity::class.java))
        }
        btn_lottie.setOnClickListener {
            startActivity(Intent(this@MainActivity,Lottie_Activity::class.java))
        }

    }



}