package com.example.demoprojectkotlin

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

var TAG = DetailActivity::class.java.toString()
class DetailActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_activity)
        initViews()
    }
    private fun initViews(){
        val tv_detail = findViewById<TextView>(R.id.tv_detail)
        val user = intent.getSerializableExtra("user")
        Log.d(TAG,user.toString())

        tv_detail.text = user.toString()
    }
}