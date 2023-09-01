package com.example.myquizapp

//this Question class will define the structure of individual question of our
//quiz app
data class Question(

    val id: Int,
    val question: String,
    val image: Int,
    val optionOne : String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: Int

)
