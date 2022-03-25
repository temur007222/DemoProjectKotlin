package com.example.demoprojectkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.demoprojectkotlin.Model.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }
    private fun initView(){
        val b_ditail = findViewById<Button>(R.id.b_detail)

        b_ditail.setOnClickListener(View.OnClickListener {
            val user = User(name = "Temur", age = 18)
            openDetailActivity(user)
        })
    }
    private fun openDetailActivity(user: User){
        val intent = Intent(this,DetailActivity::class.java)
        intent.putExtra("user",user)
        startActivity(intent)
    }
}