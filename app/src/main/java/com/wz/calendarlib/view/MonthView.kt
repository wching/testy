package com.wz.calendarlib.view

import android.content.Context
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.AttributeSet
import com.wz.calendarlib.adapter.DayAdapter
import java.util.*

internal class MonthView @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyleAttr: Int = 0) : RecyclerView(context, attrs, defStyleAttr) {

    init {
        layoutManager = GridLayoutManager(context, 7)
    }

    fun init(monthCalendar: Calendar) {
        val numberOfDays = monthCalendar.getActualMaximum(Calendar.DAY_OF_MONTH)
        val previousMonthDays = monthCalendar.get(Calendar.DAY_OF_WEEK) - monthCalendar.firstDayOfWeek
        val days = arrayListOf<Int>()

        repeat(previousMonthDays, {
            days.add(0)
        })

        days.addAll(1..numberOfDays)
        adapter = DayAdapter(days)
    }
}
