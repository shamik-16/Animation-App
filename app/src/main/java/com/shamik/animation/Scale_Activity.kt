package com.shamik.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_scale.*

class Scale_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scale)

        val size = AnimationUtils.loadAnimation(this@Scale_Activity,R.anim.scale)
        ant.startAnimation(size)

    }
}