package eu.tutorials.myquizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"


    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "Who is this?",
            R.drawable.mom1,
            "mom", "nott",
            "not", "Ausntottria",
            1
        )
        questionsList.add(que1)

        val que2 = Question(
            1, "Who is this?",
            R.drawable.monstress,
            "monstress", "dsd",
            "sds", "ds",
            1
        )
        questionsList.add(que2)

        val que3 = Question(
            1, "Who is this?",
            R.drawable.words,
            "word clown", "dv",
            "sd", "dd",
            1
        )
        questionsList.add(que3)

        val que4 = Question(
            1, "Who is this?",
            R.drawable.eyes,
            "eyes", "ww",
            "ds", "e",
            1
        )
        questionsList.add(que4)

        val que5 = Question(
            1, "Who is this?",
            R.drawable.hands,
            "me", "mom",
            "thee", "hands",
            4
        )
        questionsList.add(que5)

        val que6 = Question(
            1, "Who is this?",
            R.drawable.greee,
            "greee", "rope",
            "suicide", "suicide",
            1
        )
        questionsList.add(que6)

        val que7 = Question(
            1, "Who is this?",
            R.drawable.zombie,
            "zombie", "suicide",
            "suicide", "suicide",
            1
        )
        questionsList.add(que7)

        val que8 = Question(
            1, "Who is this?",
            R.drawable.ic_launcher_background,
            "background", "suicide",
            "suicide", "suicide",
            1
        )
        questionsList.add(que8)

        val que9 = Question(
            1, "Who is this?",
            R.drawable.rsz_palmerthing,
            "the thing", "everything",
            "nothing", "something",
            1
        )
        questionsList.add(que9)

        return questionsList
    }
}