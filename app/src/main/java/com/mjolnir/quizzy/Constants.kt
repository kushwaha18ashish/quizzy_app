package com.mjolnir.quizzy

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"


    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1=Question(
            1,"Name this Sportperson.",
            R.drawable.neymar,
            "Ronaldo","Neymar","Messi","MBappe",
            2
        )
        questionsList.add(que1)



        val que2=Question(
            2,"What is the name of this fruit?",
            R.drawable.dragonfruit,
            "PineApple","Pear","Kiwi","Dragon Fruit",
            4
        )
        questionsList.add(que2)

        val que3=Question(
            3,"Which country does this flag belongs to?",
            R.drawable.spain_flag,
            "USA","Spain","Argentina","Mexico",
            2
        )
        questionsList.add(que3)

        val que4=Question(
            4,"Name this Women Cricketer.",
            R.drawable.shafaliverma,
            "Shafali Verma","Harmanpreet Kaur","Deepti Sharma","Richa Ghose",
            1
        )
        questionsList.add(que4)

        val que5=Question(
            5,"Guess this logo.",
            R.drawable.tesla,
            "Toyoto","Tesla","Tata","Swift",
            2
        )
        questionsList.add(que5)

        val que6=Question(
            6,"What is the name of this flower?",
            R.drawable.mariegold,
            "Daffodil","Lotus","Marie Gold","Lily",
            3
        )
        questionsList.add(que6)

        val que7=Question(
            7,"What is the name of this Character?",
            R.drawable.potter,
            "Draco Malfoy","Ronald Weasley","Dobby","Harry Potter",
            4
        )
        questionsList.add(que7)

        val que8=Question(
            8,"Name the City where this monument is located.",
            R.drawable.hawamahal,
            "Delhi","Mumbai","Jaipur","None Of the Above",
            3
        )
        questionsList.add(que8)

        val que9=Question(
            9,"What is the name of this Cartoon Character.",
            R.drawable.jerry,
            "Jerry","Mickey Mouse","Tom","Dablu",
            1
        )
        questionsList.add(que9)

        val que10=Question(
            10,"What is the name of this Avenger Character.",
            R.drawable.thor,
            "Captain America","Hulk","Iron Man","Thor",
            4
        )
        questionsList.add(que10)

        return questionsList
    }
}