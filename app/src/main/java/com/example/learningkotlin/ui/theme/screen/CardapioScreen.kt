package com.example.learningkotlin.ui.theme.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningkotlin.ui.theme.components.MenuItem

class CardapioScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardapioScreenComponent() {
    Scaffold(
        topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Filled.Menu,
                            contentDescription = "",
                        )
                    }
                },
                title = {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start
                    ) {
                        Text(
                            text = "Meu cardápio",
                            modifier = Modifier.weight(1f)
                        )
                    }
                }, colors = TopAppBarDefaults.topAppBarColors(
                    titleContentColor = MaterialTheme.colorScheme.primary,
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                )
            )
        }) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            TitleSection("Lanches")
            MenuItem("X-Bacon", "Pão grelhado, carne, bacon, alface e tomate", "26,00")
            MenuItem("X-Tradicional", "Pão grelhado, carne, alface e tomate", "26,00")
            TitleSection("Bebidas")
            MenuItem("Coca-Cola", "250ml", "4,00")
            MenuItem("Água com gás", "250ml", "4,00")
        }
    }
}

@Composable
fun TitleSection(titulo: String) {
    Text(
        text = titulo.uppercase(),
        modifier = Modifier.padding(start = 16.dp, top = 16.dp),
        fontSize = 24.sp,
        color = MaterialTheme.colorScheme.primary,
        fontWeight = FontWeight.Bold
    )
}