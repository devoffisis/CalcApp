package jp.techacademy.yoshitsugu.calcapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val button4: Button = findViewById(R.id.button4)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val editText1: EditText = findViewById(R.id.editText1)
        val editText2: EditText = findViewById(R.id.editText2)
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)

        // Log.d("editText1", editText1.text.toString())
        // Log.d("editText2", editText2.text.toString())
        // Log.d("button1 ID", button1.id.toString())
        // Log.d("button2 ID", button2.id.toString())
        // Log.d("button3 ID", button3.id.toString())
        // Log.d("button4 ID", button4.id.toString())
        v?.let {
            // Log.d("it.id", it.id.toString())
            val op = when (it.id.toString()) {
                button1.id.toString() -> {
                    "+"
                }
                button2.id.toString() -> {
                    "-"
                }
                button3.id.toString() -> {
                    "*"
                }
                else -> {
                    "/"
                }
            }

            val v1 = editText1.text.toString()
            val v2 = editText2.text.toString()
            if (v1 != "" && v2 != "") {
                if (op == "/" && v2 == "0") {
                    // Log.d("Divide-By-Zero", "Error")
                } else {
                    // Log.d("Main last", v1)
                    // Log.d("Main last", v2)
                    // Log.d("Main last", op)
                    val intent = Intent(this, SecondActivity::class.java)
                    intent.putExtra("VALUE1", v1.toDouble())
                    intent.putExtra("VALUE2", v2.toDouble())
                    intent.putExtra("VALUE3", op)
                    startActivity(intent)
                }
            }
        }
    }
}
