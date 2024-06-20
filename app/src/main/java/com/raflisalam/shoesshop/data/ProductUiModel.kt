package com.raflisalam.shoesshop.data

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import kotlin.random.Random

data class ProductUiModel(
    @DrawableRes val imgResource: Int,
    val color: Color,
    val name: String,
    val price: Float,
    val oldPrice: Float,
    val rating: Float = 4.5f,
    val number: Int = Random.nextInt(10, 99)

)