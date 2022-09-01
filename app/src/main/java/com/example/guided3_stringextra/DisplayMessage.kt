package com.example.guided3_stringextra

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class DisplayMessage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent: Intent = intent
        val message: String = intent.getStringExtra(GD3StringExtra1.EXTRA_MESSAGE).toString()

        //membuat textview
        val textView = TextView(this)
        textView.setTextSize(40F)
        textView.setText("Anda memilih warna" + message)

        if(message=="Merah"){
            textView.setTextColor(Color.parseColor("#FF0000"))
        } else if (message=="Hijau"){
            textView.setTextColor(Color.parseColor("#00FF00"))
        } else {
            textView.setTextColor(Color.parseColor("#0000FF"))
        }
        setContentView(textView)
    }
}