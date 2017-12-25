package com.wz.calendarlib.extension

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Provide an easy way to inflate a view
 */
fun ViewGroup.inflate(layoutId: Int): View =
        LayoutInflater.from(this.context).inflate(layoutId, this, false)
