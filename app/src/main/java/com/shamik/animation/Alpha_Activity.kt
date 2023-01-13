package com.shamik.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_alpha.*

class Alpha_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alpha)

        val alp = AnimationUtils.loadAnimation(this@Alpha_Activity,R.anim.alpha)
        apple.startAnimation(alp)

    }
}