package com.reemsd.recyclerview.model

import android.annotation.SuppressLint
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

@SuppressLint("SupportAnnotationUsage")
data class SmartPhone(
    @DrawableRes val productImage: Int,
    @StringRes val phoneName: String,
    val phonePrice: String,
    val phoneVip:Boolean,
    val phoneQuantity:Int)
