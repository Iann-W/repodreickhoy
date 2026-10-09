package com.example.practicalistasian.ui.screens.agenda

import android.util.Log
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import com.example.practicalistasian.models.Persona
import com.example.practicalistasian.R

class AgendaViewModel : ViewModel() {

    private val _personas = MutableStateFlow<List<Persona>>(emptyList())
    val personas: StateFlow<List<Persona>> = _personas

    init {
        loadPersonas()
    }

    fun loadPersonas() {
        _personas.value = listOf(
            Persona(1, "Ian Waldo", 28, "Masculino", "+52 55 1234 5678", "ian.tellez@email.com", img = R.drawable.foto1),
            Persona(2, "Alberto Patricio", 24, "Masculino", "+52 81 9876 5432", "pato.alex@gmail.com", img = R.drawable.foto2),
            Persona(3, "Valeria Jatziry", 35, "Femenino", "+52 33 4567 8901", "valeriajat@outlook.com", img = R.drawable.foto3),
            Persona(4, "Joselin Eunice", 31, "Femenino", "+52 55 8765 4321", "joss.eunice@empresa.com", img = R.drawable.foto4),
            Persona(5, "Brandon Benjamin", 22, "Masculino", "+52 77 1122 3344", "brandon.benja@gmail.com", img = R.drawable.foto5),
            Persona(6, "Tania Martinez", 29, "Femenino", "+52 55 9988 7766", "tania.m@live.com", img = R.drawable.foto6),
            Persona(7, "Daniel Lopez", 27, "Masculino", "+52 81 3344 5566", "daniel.l@empresa.com", img = R.drawable.foto7),
            Persona(8, "Valeria Bustos", 25, "Femenino", "+52 33 6677 8899", "valeria.b@hotmail.com", img = R.drawable.foto8)
        )
    }

    fun onPersonaClicked(persona: Persona) {
        Log.d("AgendaViewModel", "Clic en: ${persona.nombre}")
    }
}