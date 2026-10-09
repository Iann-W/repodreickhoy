package com.example.practicalistasian.ui.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.practicalistasian.models.Persona

@Composable
fun PersonaList(
    personas: List<Persona>,
    onPersonaClicked: (Persona) -> Unit
) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(items = personas, key = { it.id }) { persona ->
            PersonaCard(
                persona = persona,
                onClick = { onPersonaClicked(persona) }
            )
        }
    }
}