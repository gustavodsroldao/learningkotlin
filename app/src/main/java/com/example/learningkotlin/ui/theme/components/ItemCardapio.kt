package com.example.learningkotlin.ui.theme.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp


@Composable
fun MenuItem(nome: String, descricao: String, preco: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text(nome, style = MaterialTheme.typography.bodyMedium, fontWeight = FontWeight.Bold)
            Text(descricao, style = MaterialTheme.typography.bodyMedium, color = Color.Gray)
        }

        Text(preco, color = MaterialTheme.colorScheme.primary, fontWeight = FontWeight.Bold)
    }
    HorizontalDivider()
}

@Composable
fun TitleSection(titulo: String) {
    Text(
        text = titulo.uppercase(),
        color = MaterialTheme.colorScheme.primary,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(start = 16.dp, top = 16.dp, bottom = 4.dp)

    )
}