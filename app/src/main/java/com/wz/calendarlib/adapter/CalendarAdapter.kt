package com.wz.calendarlib.adapter

import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.ViewHolder
import android.text.format.DateUtils
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.wz.calendarlib.R
import com.wz.calendarlib.extension.inflate
import com.wz.calendarlib.view.MonthView
import kotlinx.android.synthetic.main.item_month.view.*
import java.util.Calendar
import java.util.Date

internal class CalendarAdapter(startDate: Date = Calendar.getInstance().time, numberOfMonths: Int = 12)
    : RecyclerView.Adapter<CalendarAdapter.MonthViewHolder>() {

    val months = arrayListOf<Calendar>()

    init {
        createMonths(startDate, numberOfMonths)
    }

    override fun onBindViewHolder(holder: MonthViewHolder?, position: Int) =
            (holder as MonthViewHolder).bind(months[position])

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MonthViewHolder(parent.inflate(R.layout.item_month))

    override fun getItemCount() = months.size

    internal class MonthViewHolder(itemView: View) : ViewHolder(itemView) {

        private val flags = (DateUtils.FORMAT_SHOW_DATE or DateUtils.FORMAT_SHOW_YEAR
                or DateUtils.FORMAT_NO_MONTH_DAY)

        private val mTitleTextView: TextView by lazy { itemView.mTitleTextView }
        private val mMonthView: MonthView by lazy { itemView.mMonthView }

        fun bind(item: Calendar) {
            mTitleTextView.text = DateUtils.formatDateTime(itemView.context, item.timeInMillis, flags)
            mMonthView.init(item)
        }
    }

    fun createMonths(startDate: Date, numberOfMonths: Int) {
        Calendar.getInstance()
                .apply {
                    time = startDate
                    set(Calendar.DAY_OF_MONTH, 1)
                }
                .run {
                    repeat(numberOfMonths, {
                        months.add(this.clone() as Calendar)
                        add(Calendar.MONTH, 1)
                        set(Calendar.DATE, getActualMinimum(Calendar.DAY_OF_MONTH))
                    })
                }
    }
}
