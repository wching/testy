package com.walterching.calendarlib10

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calendarView.layoutManager =
                LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        calendarView.adapter = CalendarAdapter(
                listOf(
                        // Month 1
                        listOf(11, 22, 33, 44, 55, 6, 7, 8, 9, 10, 11, 11, 22, 33, 44, 55, 6,
                                7, 8, 9, 10, 11, 11, 22, 33, 44, 55, 6, 7, 8, 9, 10, 11),

                        // Month 2
                        listOf(1, 2, 3, 34, 5, 6, 7, 8, 9, 10, 11, 11, 11, 22, 33, 44, 55, 6,
                                7, 8, 9, 10, 11, 11, 22, 33, 44, 55, 6, 7, 8, 9, 10, 11),

                        // Month 3
                        listOf(1, 2, 3, 4, 25, 6, 7, 8, 9, 10, 12, 11, 11, 22, 33, 44, 55, 6,
                                7, 8, 9, 10, 11, 11, 22, 33, 44, 55, 6, 7, 8, 9, 10, 11),

                        // Month 4
                        listOf(1, 12, 3, 4, 15, 6, 7, 8, 9, 10, 13, 11, 11, 22, 33, 44, 55, 6,
                                7, 8, 9, 10, 11, 11, 22, 33, 44, 55, 6, 7, 8, 9, 10, 11),

                        // Month 5
                        listOf(1, 12, 3, 4, 15, 6, 7, 8, 9, 10, 13, 11, 11, 22, 33, 44, 55, 6,
                                7, 8, 9, 10, 11, 11, 22, 33, 44, 55, 6, 7, 8, 9, 10, 11),

                        // Month 6
                        listOf(1, 12, 3, 4, 15, 6, 7, 8, 9, 10, 13, 11, 11, 22, 33, 44, 55, 6,
                                7, 8, 9, 10, 11, 11, 22, 33, 44, 55, 6, 7, 8, 9, 10, 11),

                        // Month 7
                        listOf(1, 12, 3, 4, 15, 6, 7, 8, 9, 10, 13, 11, 11, 22, 33, 44, 55, 6,
                                7, 8, 9, 10, 11, 11, 22, 33, 44, 55, 6, 7, 8, 9, 10, 11),

                        // Month 8
                        listOf(1, 12, 3, 4, 15, 6, 7, 8, 9, 10, 13, 11, 11, 22, 33, 44, 55, 6,
                                7, 8, 9, 10, 11, 11, 22, 33, 44, 55, 6, 7, 8, 9, 10, 11)

                )
        )
    }
}
