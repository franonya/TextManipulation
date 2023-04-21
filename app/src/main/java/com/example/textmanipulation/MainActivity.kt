package com.example.textmanipulation

import android.graphics.Color
import android.graphics.Color.RED
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.example.textmanipulation.ui.theme.TextManipulationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextManipulationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Content("Android")
                }
            }
        }
    }
}

@Composable
fun Content(name: String) {
    Text(text = "Hello $name!".repeat(10),
   // color = MaterialTheme.colors.error,
    fontFamily = FontFamily.SansSerif,
        fontSize=26.sp,
        fontWeight = FontWeight.Bold,
        fontStyle = FontStyle.Italic,
        color= androidx.compose.ui.graphics.Color.Magenta,
       // style=MaterialTheme.typography.h1,


    )
}



