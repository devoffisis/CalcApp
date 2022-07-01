package jp.techacademy.yoshitsugu.calcapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textView: TextView = findViewById(R.id.textView)
        val value1 = intent.getIntExtra("VALUE1", 0)
        val value2 = intent.getIntExtra("VALUE2", 0)
        val value3 = intent.getStringExtra("op")

        val res = if (value3 == "+") {
            value1 + value2
        } else if (value3 == "-") {
            value1 - value2
        } else if (value3 == "*") {
            value1 * value2
        } else {
            value1 / value2
        }

        textView.text = res.toString()
    }
}
