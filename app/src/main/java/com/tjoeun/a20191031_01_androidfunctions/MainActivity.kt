package com.tjoeun.a20191031_01_androidfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var receivedName = intent.getStringExtra("name")
        var receivedNumber = intent.getStringExtra("number")
        var receivedId = intent.getStringExtra("id")

        Log.d("로그",receivedName)
        Log.d("로그",receivedNumber)

        /*
        mainName.text = intent.getStringExtra("name")
        mainNum.text = intent.getStringExtra("number")+"번 회원" */
        mainName.text = "${receivedName}(${receivedId})"
        mainNum.text = "${receivedNumber} 번 회원"
    }
}
