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
        val drink = 2

        when (drink) {
            0 -> {
                Log.d("kotlinttest","コーヒーを注文しました")
            }
            1 -> Log.d("kotlintest","紅茶を注文しました")
            2 -> Log.d("kotlintest","ミルクを注文しました")
            else -> Log.d("kotlintest","オーダーミスです")
        }

        val drink2 = when (drink) {
            0 -> "コーヒーを注文しました"
            1 -> "ミルクを注文しました"
            2 -> "紅茶を注文しました"
            else -> "オーダーミスです"
        }
        Log.d("kotlintest",drink2)

        val num4 = 60
        val str = if (num4 >= 90) "優" else "その他"
        Log.d("kotlintest","" + str)

        //for文テスト
        for (i in 0 until 10) {
            Log.d("kotlintest",i.toString())
        }

        //while文テスト
        var num5 = 10

        while (num5 < 10) {
            Log.d("kotlintest","先" + num5.toString())
            num5++
        }

        var num6 = 10

        do {
            Log.d("kotlintest","後" + num6.toString())
            num6++
        } while (num6 <10)


        for(i in 1 until 6){
            Log.d("kotlintest","for文の" + i + "回目")
        }

        var num7 = 1

        while (num7 < 6) {
            Log.d("kotlintest","while文の" + num7 + "回目")
            num7++
        }

        //1～3まで
        for (i in 1..3){
            Log.d("kotlintest","..演算子の" + i + "回目")
        }

        //6から2飛ばしで0まで
        for (i in 6 downTo 0 step 2){
            Log.d("kotlintest","downTo関数の" + i + "回目")
        }

        //0から2飛ばしで6まで
        for (i in 0 until 6 step 2){
            Log.d("kotlintest","for文の" + i + "回目")
        }

        //Array<int>型の配列が作成される
        val points = arrayOf(10,6,15,23,17)

        for (i in points){
        Log.d("kotlintest2",i.toString())
        }

        //例外処理
        val num8 = 100
        val num9 = 0
        var ans = 0

        try {
            ans = num8 / num9
        } catch (e: Exception) {
            Log.d("kotlintest2","0で割ろうとしました")
        // 例外情報から、メッセージを表示
            Log.d("kotlintest2",e.message)
        } finally {
            Log.d("kotlintest2","ans = " + ans.toString())
        }

    }
}
