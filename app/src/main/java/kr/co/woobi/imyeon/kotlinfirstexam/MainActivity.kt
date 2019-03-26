package kr.co.woobi.imyeon.kotlinfirstexam

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_mine.setOnClickListener {
            Toast.makeText(this, "클릭", Toast.LENGTH_SHORT).show()

//        startActivity(Intent(this, SecondActivity::class.java))

            //anko 덕에 더 짧고 간결하게 쓸 수 있다.
            startActivity<SecondActivity>()
            toast("click")
        }
        //상수선언 (Value)
        val i = 10
        val str = "ggg"
        val doulbe = 3.21

        //변수선언(varable)
        var a = 20

    }
}
