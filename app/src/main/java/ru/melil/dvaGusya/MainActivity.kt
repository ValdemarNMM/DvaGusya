package ru.melil.dvaGusya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.jvm.internal.MagicApiIntrinsics


class MainActivity : AppCompatActivity() {


    private lateinit var image: ImageView
    private lateinit var button1: Button
    private lateinit var button: Button
    private lateinit var title: TextView
    private lateinit var magic: TextView

    private var number: Int = 124
    private var multiplier: Int = 12


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        title = findViewById(R.id.title)
        magic = findViewById(R.id.magic)
        button1 = findViewById(R.id.ichi)

        button.setTextColor(resources.getColor(R.color.black))

        button.setOnClickListener {
            magic.text = (number * multiplier).toString()
        }

        }



        }







