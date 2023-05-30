package com.example.ktcomposepractise_1

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val name = "Micaela"
val cuerpo = "Como estas?"
val textSize = 15.dp
var roomType = "Bedroom"


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            SimpleText(Message(name, cuerpo))
            RoomUi()
        }
    }
}


data class RoomData(val roomType: String, val roomId: String)

@Composable
fun RoomUi() {
    Box(
        Modifier
            .fillMaxSize()
            .blur(radius = 0.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.home_outside),
            contentDescription = null,
            contentScale = ContentScale.FillHeight,
            modifier = Modifier
        )

        Card(
            modifier = Modifier

                .fillMaxWidth()
                .height(380.dp)
                .align(Alignment.BottomCenter),
            backgroundColor = Color.Black.copy(alpha = 0.7f),
            shape = RoundedCornerShape(topEnd = 50.dp, topStart = 50.dp)
        )
        {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .align(Alignment.Center)
            )
            {
                Text(
                    text = name,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(PaddingValues(27.dp, 30.dp, 27.dp, 0.dp)),
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 30.sp,
                        fontStyle = FontStyle.Normal
                    )
                )
                Text(
                    text = "Your " + roomType + " is conected with 5 devices, you have all access",
                    Modifier
                        .fillMaxWidth()
                        .padding(PaddingValues(27.dp, 37.dp, 27.dp, 0.dp)),
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 16.sp
                    )
                )
                Divider(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(PaddingValues(15.dp, 26.dp, 15.dp, 0.dp)),
                    color = Color.White,
                    thickness = 1.dp
                )
            }

        }


    }

}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun DefaultPreview() {
    RoomUi()
}




