package com.walterching.calendarlib10

import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.walterching.calendarlib10.extensions.inflate
import kotlinx.android.synthetic.main.item_month.view.*

class CalendarAdapter(private var monthList: List<List<Int>>) :
        RecyclerView.Adapter<CalendarAdapter.MonthViewHolder>() {

    override fun getItemCount(): Int = monthList.size

    override fun onBindViewHolder(holder: MonthViewHolder, position: Int) {
        holder.bind(monthList[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MonthViewHolder =
            MonthViewHolder(parent.inflate(R.layout.item_month))

    class MonthViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val itemMonthTitle: TextView by lazy { itemView.itemMonthTitle }
        private val itemMonthRecyclerView: RecyclerView by lazy { itemView.itemMonthRecyclerView }

        fun bind(days: List<Int>) {
            itemMonthTitle.text = "Month"
            itemMonthRecyclerView.layoutManager = GridLayoutManager(itemMonthRecyclerView.context, 7)
            itemMonthRecyclerView.adapter = MonthAdapter(days)
        }
    }
}
