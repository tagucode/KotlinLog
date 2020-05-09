package jp.techacademy.satoshi.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log  //追加した行

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ログ出力テスト
        val num1 = 10 + 5 - 2 * 4 / 2
        Log.d("kotlintest","10 + 5 - 2 * 4 / 2 = " + num1)

        val flag1 = true
        val flag2 = false
        Log.d("kotlintest","flag1 && flag2 = " + (flag1 && flag2))
        Log.d("kotlintest","flag1 || flag2 = " + (flag1 || flag2))

        val num2 = 10
        val num3 = 20
        Log.d("kotlintest","num2 < num3 = " + (num2 < num3))

        //if分テスト
        val num = 90

        if (num >=  90) {
            Log.d("kotlintest","優")
        } else if (num >= 75) {
            Log.d("kotlintest","良")
        } else if (num >= 60) {
            Log.d("kotlintest","可")
        } else {
            Log.d("kotlintest","不可")
        }

        //when文テスト



    }
}
