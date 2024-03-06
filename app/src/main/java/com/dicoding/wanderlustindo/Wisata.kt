package com.dicoding.wanderlustindo

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Suppress("DEPRECATED_ANNOTATION")
@Parcelize
data class Wisata(
    val name: String,
    val description: String,
    val photo: Int
) : Parcelable