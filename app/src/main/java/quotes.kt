package ru.movchan.myapplication

import java.util.ArrayList

data class quotes(val success:Boolean, val data:ArrayList<data_quotes>)
data class data_quotes(val id:Int, val title:String, val image:String, val description:String)