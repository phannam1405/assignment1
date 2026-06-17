package com.example.ksstudentsapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.ksstudentsapp.ui.theme.KSStudentsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KSStudentsAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GreetingButton(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingButton(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    Button(
        onClick = {
            Toast.makeText(context, "xin chào", Toast.LENGTH_SHORT).show()
        },
        modifier = modifier
    ) {
        Text(text = "Bấm vào đây")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingButtonPreview() {
    KSStudentsAppTheme {
        GreetingButton()
    }
}