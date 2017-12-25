package com.wz.calendarlib.view

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.AttributeSet
import com.wz.calendarlib.adapter.CalendarAdapter

class CalendarView @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyleAttr: Int = 0) : RecyclerView(context, attrs, defStyleAttr) {

    init {
        setHasFixedSize(true)
        layoutManager = LinearLayoutManager(context)
        adapter = CalendarAdapter()
    }
}
