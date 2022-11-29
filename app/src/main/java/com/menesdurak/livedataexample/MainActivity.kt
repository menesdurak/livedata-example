package com.menesdurak.livedataexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.lifecycle.Observer

class MainActivity : AppCompatActivity() {
    private val model: WordViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val wordObserver = Observer<String> { newWord ->
            findViewById<TextView>(R.id.tvName).text = newWord
        }

        model.currentWord.observe(this, wordObserver)

        findViewById<Button>(R.id.button).setOnClickListener {
            val changedName = "Bye World!"
            model.currentWord.setValue(changedName)
        }
    }

}
