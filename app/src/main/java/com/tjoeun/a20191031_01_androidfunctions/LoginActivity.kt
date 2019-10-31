package com.tjoeun.a20191031_01_androidfunctions

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

            Toast.makeText(this,"${name} 회원님 회원번호 ${number}로 들어오신걸 환영 합니다.",Toast.LENGTH_SHORT).show()


        }

    }
}
