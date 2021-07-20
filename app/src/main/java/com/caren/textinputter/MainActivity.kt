package com.caren.textinputter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // When user clicks on button, change text to
        // "Hello from Caren".

        findViewById<Button>(R.id.button).setOnClickListener {
            Log.i("Caren", "User clicked on button")

            // Grab the text that's in the EditText
               // Display that text in the TextView
            val userInputtedString =
                findViewById<EditText>(R.id.editText).text.toString()

            findViewById<TextView>(R.id.textView2).text = userInputtedString

//            findViewById<TextView>(R.id.textView2).text =
//                "Hello from Caren!"
        }
    }
}