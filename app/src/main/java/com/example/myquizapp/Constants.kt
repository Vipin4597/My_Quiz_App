package com.example.myquizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_quesetions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>
    {
        val questionsList= ArrayList<Question>()

        val ques1= Question(

                1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", " Australia",
            "Armenia", "Austria",
            1
        )

        val ques2= Question(

            2,"What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Argentina", " Australia",
            "Japan", "Bangladesh",
            2
        )


        val ques3= Question(

            3,"What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Russia", " Australia",
            "Belgium", "Ukrain",
            3
        )

        val ques4= Question(

            4,"What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Brazil", "Armenia",
            "Belgium", "South Africa",
            1
        )

        val ques5= Question(

            5,"What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Poland", " Germany",
            "Dubai", "Denmark",
            4
        )


        val ques6= Question(

            6,"What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "fiji", " New Zealand",
            " Costa Rica", " Russia",
            1
        )

        val ques7= Question(

            7,"What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "India", " Mayanmar",
            "Pakistan", " Thailand",
            1
        )

        val ques8= Question(

            8,"What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Iran", " Kuwait",
            "Iraq", "Syria",
            2
        )

        val ques9= Question(

            9,"What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            " Poland", " UK",
            "Germany", " Ujbekistan",
            3
        )

        val ques10= Question(

            10,"What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            " Ukrain", " New Zealand",
            "Australia", " USA",
            2
        )

        questionsList.add(ques1)
        questionsList.add(ques2)
        questionsList.add(ques3)
        questionsList.add(ques4)
        questionsList.add(ques5)
        questionsList.add(ques6)
        questionsList.add(ques7)
        questionsList.add(ques8)
        questionsList.add(ques9)
        questionsList.add(ques10)

        return questionsList






    }

}