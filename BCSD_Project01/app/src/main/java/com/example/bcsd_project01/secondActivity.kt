package com.example.bcsd_project01

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class secondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var number = intent.getIntExtra("main_num") //* 메인 엑티비에서 가져온 카운트 횟수 *
        val show_num =findViewById<TextView>(R.id.maintext)// 변화할 텍스트 뷰의 주소 값
        val main_text =findViewById<TextView>(R.id.maintext)//랜덤된 숫자를 표시하는 텍스트 뷰의 주소 값

        var random_number = Random(number)//랜덤된 숫자를 얻음 0~ number

        var improtstr1 = "Here os a randrom number \n between 0 and "//불변상태인 텍스트
        var numberstr = number.toString()//가져온 숫자를 string 형태로 변환

        show_num.text = improtstr1 + numberstr //변할 텍스트에 두개의 문자열을 합쳐서 넣는다.
        main_text.text = random_number.toString()//랜덤으로 얻은 숫자를 문자열로 변환해서 넣기


    }
}