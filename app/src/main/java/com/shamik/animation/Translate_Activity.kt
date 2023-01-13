package com.shamik.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_translate.*

class Translate_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_translate)

        val move = AnimationUtils.loadAnimation(this@Translate_Activity,R.anim.translate)
        car.startAnimation(move)

    }
}