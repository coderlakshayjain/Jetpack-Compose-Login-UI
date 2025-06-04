package com.lakshay.jetpackcomposeloginui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.lakshay.jetpackcomposeloginui.ui.theme.ComposeLoginUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // enableEdgeToEdge()
        setContent {
            ComposeLoginUITheme {
                LoginScreen()
            }
        }
    }
}