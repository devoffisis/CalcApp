package jp.techacademy.yoshitsugu.calcapp

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textView: TextView = findViewById(R.id.textView)
        val value1 = intent.getDoubleExtra("VALUE1", 0.0)
        val value2 = intent.getDoubleExtra("VALUE2", 1.0)
        val value3 = intent.getStringExtra("VALUE3")

        Log.d("value1", value1.toString())
        Log.d("value2", value2.toString())
        if (value3 != null) {
            Log.d("value3", value3)
        }

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
