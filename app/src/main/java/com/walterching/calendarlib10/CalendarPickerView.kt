package com.walterching.calendarlib10

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.AttributeSet
import java.util.*

class CalendarPickerView: RecyclerView {

    constructor(context: Context) : super(context)

    constructor(context: Context, attributeSet: AttributeSet) : super(context, attributeSet)

    constructor(context: Context, attributeSet: AttributeSet, defStyle: Int) : super(context, attributeSet, defStyle)

    val builder = CalendarPickerBuilder(context)

    class CalendarPickerBuilder(var context: Context) {

        lateinit var locale: Locale
        lateinit var timeZone: TimeZone
        lateinit var minDate: Date
        lateinit var maxDate: Date

        fun setMinAndMaxDate(minDate: Date, maxDate: Date): CalendarPickerBuilder = apply {
            this.minDate = minDate
            this.maxDate = maxDate
        }

        fun setLocale(locale: Locale) = apply {
            this.locale = locale
        }

        fun setTimezone(timeZone: TimeZone) = apply {
            this.timeZone = timeZone
        }

    }
}
