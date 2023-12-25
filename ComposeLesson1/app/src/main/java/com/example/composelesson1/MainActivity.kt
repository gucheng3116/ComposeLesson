package com.example.composelesson1

import android.os.Bundle
import android.widget.ScrollView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.modifier.modifierLocalConsumer
import com.example.composelesson1.ui.theme.ComposeLesson1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeLesson1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.primary
                ) {
//                    Greeting("Android")
                    AddState()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = "Hello Android",
            modifier = Modifier.padding(24.dp)
        )
        Text(
            text = "Hello World",
            modifier = Modifier.padding(24.dp)
        )
    }
}

@Composable
fun LazyGreeting() {
    LazyColumn {
        items(1000) {
            Text("Item $it")
        }
    }
}

@Composable
fun AddState() {
    var num by remember { mutableStateOf(0) }
    var num1 = 0
    Row {
        Text(
            num1.toString(),
            modifier = Modifier.padding(10.dp)
        )

        ElevatedButton(
            onClick = {
                num1 += 1
            },
            modifier = Modifier.padding(start = 10.dp)
        ) {
            Text("+1")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeLesson1Theme {
        Greeting("Android")
    }
}