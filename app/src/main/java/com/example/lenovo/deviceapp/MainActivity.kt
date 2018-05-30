package com.example.lenovo.deviceapp

import android.app.Fragment
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.concurrent.timer
import kotlin.concurrent.timerTask

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionBar = supportActionBar
        actionBar!!.hide()
        //val intent=Intent(this@MainActivity,Login::class.java)

        val timer = Timer()
        timer.schedule(timerTask {
            startActivity(Intent(this@MainActivity,Login::class.java))
            finish()
        }, 100)

    }
}
