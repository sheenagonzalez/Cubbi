package com.example.cubbi

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.HandlerCompat
import androidx.core.os.HandlerCompat.postDelayed





class SplashActivity : AppCompatActivity() {

    lateinit var smallCircle : ImageView
    lateinit var mediumCircle : ImageView
    lateinit var largeCircle : ImageView
    lateinit var splashLayout : RelativeLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        smallCircle = findViewById(R.id.small_circle);
        mediumCircle = findViewById(R.id.medium_circle);
        largeCircle = findViewById(R.id.large_circle);
        splashLayout = findViewById(R.id.splash_container);

        val scaleAnimation: Animation =
            AnimationUtils.loadAnimation(this, R.anim.scale)
        smallCircle.startAnimation(scaleAnimation)
        mediumCircle.startAnimation(scaleAnimation)
        largeCircle.startAnimation(scaleAnimation)
        splashLayout.postDelayed(Thread(Runnable() {startActivity(Intent(this, LoginActivity::class.java))}), 1000)
    }
}