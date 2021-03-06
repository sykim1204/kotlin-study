package com.androidhuman.example.simplegithub.ui.main

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.androidhuman.example.simplegithub.R
import com.androidhuman.example.simplegithub.ui.search.SearchActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "[ksg] launchMainActivity()")

        btnActivityMainSearch.requestFocus() // [syk] STB 환경에서 버튼 선택이 어려워 추가
        btnActivityMainSearch.setOnClickListener {
            startActivity(Intent(this@MainActivity, SearchActivity::class.java))
        }
    }
}