package com.example.lanchonete

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lanchonete.ui.theme.LanchoneteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LanchoneteTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {

    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Hello $name!", modifier = Modifier.padding(top = 16.dp, start = 16.dp))
        Text(text = "Hello $name!", modifier = Modifier.padding(top = 16.dp, start = 16.dp))
        Row() {
            Text(text = "Hello $name!")
            Text(text = "Hello $name!")
        }
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Hello BOTAO!")

        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LanchoneteTheme {
        Greeting("deivide")
    }
}