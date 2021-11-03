package com.example.superherorecylerview

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize

data class Superhero(
    val imgSuperhro: Int,
    val nameSuperhero: String,
    val DescSuperhero: String
): Parcelable
