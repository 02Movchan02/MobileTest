import ru.movchan.myapplication.R

data class state(val title:String, val text_state:String, val image_state:Int)
class MyState
{
    val state_list= arrayListOf(state("Заголовок статьи 1", "Краткое описание 1",R.drawable.tiger_001),
        state("Заголовок статьи 2", "Краткое описание 2",R.drawable.emerald))
}
