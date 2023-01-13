package com.shamik.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_rotation.*

class Rotation_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rotation)

        val rotate = AnimationUtils.loadAnimation(this@Rotation_Activity,R.anim.rotation)
        wheel.startAnimation(rotate)

    }
}