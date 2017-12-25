package com.walterching.calendarlib10

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.walterching.calendarlib10.extensions.inflate
import kotlinx.android.synthetic.main.item_day.view.*

class MonthAdapter(private var daysList: List<Int>) : RecyclerView.Adapter<MonthAdapter.DayViewHolder>() {

    override fun getItemCount(): Int = daysList.size

    override fun onBindViewHolder(holder: DayViewHolder, position: Int) =
            holder.bind(daysList[position])

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DayViewHolder =
            DayViewHolder(parent.inflate(R.layout.item_day))

    class DayViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val itemDayView: TextView by lazy { itemView.itemDayView }

        fun bind(date: Int) {
            itemDayView.text = date.toString()
            Log.e(MonthAdapter::class.java.simpleName, date.toString())
        }
    }
}