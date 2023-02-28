package com.example.jetheroes

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetheroes.ui.theme.JetHeroesTheme

@Composable
fun JetHeroesApp(modifier: Modifier = Modifier) {
    Box(modifier = modifier) {

    }
}

@Preview(showBackground = true, device = Devices.PIXEL_4, showSystemUi = true)
@Composable
fun JetHeroAppPreview() {
    JetHeroesTheme {
        JetHeroesApp()
    }
}