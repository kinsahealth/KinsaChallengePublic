package com.kinsa.challenge.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.kinsa.challenge.ui.AppTheme

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = viewModel()
) {
    HomeView(
        text = viewModel.text
    )
}

@Composable
private fun HomeView(
    text: String
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            color = MaterialTheme.colorScheme.onBackground
        )
    }
}

@Preview
@Composable
private fun HomeViewLightPreview() {
    AppTheme(isSystemInDarkTheme = false) {
        HomeView(
            text = "This is a light preview"
        )
    }
}

@Preview
@Composable
private fun HomeViewDarkPreview() {
    AppTheme(isSystemInDarkTheme = true) {
        HomeView(
            text = "This is a dark preview"
        )
    }
}