package com.example.ktcomposepractise_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImprimirMensaje("Nahuel")

        }
    }
}
@Composable
fun ImprimirMensaje(name : String){
    Text(text = "Hola")
}

