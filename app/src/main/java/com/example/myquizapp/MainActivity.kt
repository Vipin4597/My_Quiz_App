package com.example.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var btn_Start: Button
    lateinit var et_name: EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_Start= findViewById(R.id.btn_Start)
        et_name= findViewById(R.id.et_name)


        btn_Start.setOnClickListener {

            if(et_name.text.isEmpty())
            {
                Toast.makeText(this,
                    "Please Enter Your Name", Toast.LENGTH_SHORT).show()
            }
            else
            {
                // intent is like a bridge which is used to link two activity and to go from one activity to
                //another
                Toast.makeText(this,
                    toastm
                    , Toast.LENGTH_SHORT).show()
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME, et_name.text.toString())

                startActivity(intent)
                finish()
            }

        }
    }
}