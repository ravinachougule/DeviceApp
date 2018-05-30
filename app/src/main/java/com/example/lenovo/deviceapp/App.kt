package com.example.lenovo.deviceapp

import android.app.Application
import com.android.volley.RequestQueue
import com.android.volley.toolbox.Volley
import com.google.gson.Gson

class App:Application() {
    val gson: Gson by lazy{
        Gson()
    }
    val reqQue: RequestQueue by lazy{
        Volley.newRequestQueue(this)
    }
    override fun onCreate() {
        super.onCreate()
        gson
        reqQue
    }
}