package com.tjoeun.a20191031_01_androidfunctions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    //이름과 회원번호를 입력하고 로그인 버튼을 누르면
    //10번 김기백 회원님 환영합니다. 라는 토스트를 띄우자

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginLoginBtn.setOnClickListener {
            var name = loginName.text
            var number = loginNumber.text

            Toast.makeText(this,"회원번호 ${number}, ${name}님 로그인을 환영 합니다.",Toast.LENGTH_SHORT).show()

            var myIntent = Intent(this,MainActivity::class.java)
            myIntent.putExtra("user",name.toString())
            myIntent.putExtra("number",number.toString())
            startActivity(myIntent)
        }

        loginSignBtn.setOnClickListener {
            var myIntent = Intent(this,SignUpActivity::class.java)

            startActivity(myIntent)
        }

    }
}
//연습문제
//회원가입(signUp) 화면을 만들고 배경을 초록색(#00FF00)으로만 설정하자
// 회원가입 버튼을 누르면 해당 액티비티로 이동하도록