package com.example.practicalistasian.models

import androidx.annotation.DrawableRes

data class Persona(
    val id: Int,
    val nombre: String,
    val edad: Int,
    val genero: String,
    val telefono: String,
    val correo: String,
    @DrawableRes val img: Int? = null
)