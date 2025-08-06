package com.kinsa.challenge

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.kinsa.challenge.home.HomeScreen
import com.kinsa.challenge.ui.AppTheme

@Composable
fun MainView() {
    AppTheme {
        HomeScreen()
    }
}

@Preview
@Composable
private fun MainViewPreview() {
    MainView()
}