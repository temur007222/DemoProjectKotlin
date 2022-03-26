package com.example.demoprojectkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }
    private fun initView(){
        val b_ditail = findViewById<Button>(R.id.b_detail)

        b_ditail.setOnClickListener(View.OnClickListener { openDetailActivity()
        })
    }
    private fun openDetailActivity(){
        val intent = Intent(this,DetailActivity::class.java)
        intent.putExtra("name and age: ","Temur 17")
        startActivity(intent)
    }
}