package com.neppplus.kotlinbasic_20211102

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLog.setOnClickListener {

//            Ctrl + /  :  이 줄을 주석으로 변경. / 주석 해제
//            주석 : 코드에 메모 남기기. => 컴퓨터가 분석하지 않고 그냥 넘어감.

//            로그를 찍어보기
            Log.d("메인화면", "로그찍기 버튼이 눌림")
            Log.e("메인화면", "Log.e로 찍어보기")

        }

    }
}