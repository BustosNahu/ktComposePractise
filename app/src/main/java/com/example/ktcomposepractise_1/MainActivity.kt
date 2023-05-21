package com.example.ktcomposepractise_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val name = "Micaela"
val cuerpo = "Como estas?"
val textSize = 15.dp


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleText(Message(name, cuerpo))


        }
    }
}


data class Message(val nombre: String, val cuerpo: String)

@Composable
fun SimpleText(msg: Message) {
    Row() {
        Spacer(modifier = Modifier
            .width(10.dp)
            .height(10.dp))
        Image(
            painter = painterResource(R.drawable.test_pic),
            contentDescription = null,
            modifier = Modifier
                .size(45.dp)
                .clip(CircleShape)
                .border(1.5.dp, MaterialTheme.colors.secondary, CircleShape)
        )

        Spacer(modifier = Modifier.width(6.dp))

        Column {
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = msg.nombre,
                Modifier.size(13.dp),
                )
            Spacer(modifier = Modifier.height(6.dp))
            Text(text = msg.cuerpo)
        }
    }

}

@Preview(showBackground = true,
            showSystemUi = true)
@Composable
fun SimpleTextPreview() {
    SimpleText(Message(name, cuerpo))

}

