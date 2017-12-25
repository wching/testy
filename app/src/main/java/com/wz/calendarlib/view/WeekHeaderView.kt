package com.wz.calendarlib.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.wz.calendarlib.R
import kotlinx.android.synthetic.main.item_week.view.*
import java.text.SimpleDateFormat
import java.util.*

internal class WeekHeaderView @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyleAttr: Int = 0) : LinearLayout(context, attrs, defStyleAttr) {

    init {
        orientation = HORIZONTAL
        createView()
    }

    private fun createView() {
        val calendar = Calendar.getInstance()
        for (i in 0 until 7) {
            calendar.set(Calendar.DAY_OF_WEEK, calendar.firstDayOfWeek + i)

            LayoutInflater.from(context).inflate(R.layout.item_week, this, false)
                    .apply {
                        mWeekTextView.text = SimpleDateFormat("EEE").format(calendar.time)
                    }
                    .run { addView(this) }
        }
    }
}
