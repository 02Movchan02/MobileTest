import ru.movchan.myapplication.R

data class feel(val image:Int, val name_feel:String)
class MyFeel{val list= arrayListOf(feel(R.drawable.rocket,"Супер"),
    feel(R.drawable.smile,"По кайфу"),
    feel(R.drawable.heart,"В поряде"),
    feel(R.drawable.emoji,"Ну такое"),
    feel(R.drawable.cancel, "Плохо"),
    feel(R.drawable.trash, "Трэш"))}