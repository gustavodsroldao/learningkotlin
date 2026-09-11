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
import com.example.learningkotlin.model.Prato
import com.example.learningkotlin.ui.theme.components.PratoCard

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
        val lanches = listOf(
            Prato(
                nome = "X-Bacon",
                descricao = "Pão grelhado, carne, bacon, alface e tomate",
                preco = "26,00",
                imagemUrl = "https://picsum.photos/seed/x-bacon/200"
            ),
            Prato(
                nome = "X-Tradicional",
                descricao = "Pão grelhado, carne, alface e tomate",
                preco = "26,00",
                imagemUrl = "https://picsum.photos/seed/x-tradicional/200"
            )
        )
        val bebidas = listOf(
            Prato(
                nome = "Coca-Cola",
                descricao = "250ml",
                preco = "4,00",
                imagemUrl = "https://picsum.photos/seed/coca-cola/200"
            ),
            Prato(
                nome = "Água com gás",
                descricao = "250ml",
                preco = "4,00",
                imagemUrl = "https://picsum.photos/seed/agua-com-gas/200"
            )
        )

        Column(modifier = Modifier.padding(innerPadding)) {
            TitleSection("Lanches")
            lanches.forEach { prato -> PratoCard(prato) }
            TitleSection("Bebidas")
            bebidas.forEach { prato -> PratoCard(prato) }
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