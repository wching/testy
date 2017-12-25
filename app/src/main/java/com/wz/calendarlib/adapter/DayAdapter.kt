package com.wz.calendarlib.adapter

import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.ViewHolder
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.wz.calendarlib.R
import com.wz.calendarlib.extension.inflate
import kotlinx.android.synthetic.main.item_day.view.*

internal class DayAdapter(private val days: List<Int>)
    : RecyclerView.Adapter<DayAdapter.DayViewHolder>() {

    override fun onBindViewHolder(holder: DayViewHolder?, position: Int) =
            (holder as DayViewHolder).bind(days[position])

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
            = DayViewHolder(parent.inflate(R.layout.item_day))

    override fun getItemCount() = days.size

    internal class DayViewHolder(itemView: View) : ViewHolder(itemView) {

        private val mDayTextView: TextView by lazy { itemView.mDayTextView }

        fun bind(item: Int) {
            if (item > 0) {
                mDayTextView.text = item.toString()
            }
        }
    }
}
