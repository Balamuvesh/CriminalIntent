package com.example.criminalintent

import android.icu.text.CaseMap
import android.icu.text.DateTimePatternGenerator
import java.util.*

data class Crime(
    val id: UUID = UUID.randomUUID(),
    var title: String = "",
    var date: Date = Date(),
    var isSolved: Boolean = false
)