package com.emirhantemizyurek.firstappwithcompose


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.emirhantemizyurek.firstappwithcompose.ui.HomeScreen


class MainActivity : ComponentActivity() {
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomeScreen()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
}