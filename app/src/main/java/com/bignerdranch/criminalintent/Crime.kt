package com.bignerdranch.criminalintent

import android.text.format.DateFormat
import java.util.*

data class Crime(val id: UUID = UUID.randomUUID(),
                 var title: String = "",
                 var date: Date = Date(),
                 var isSolved: Boolean = false){
    fun getDate(): String{
        return DateFormat.format("MMM dd, yyyy", date) as String
    }
}
