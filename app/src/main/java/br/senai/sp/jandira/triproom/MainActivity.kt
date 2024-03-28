package br.senai.sp.jandira.triproom

import android.content.ClipData.Item
import android.content.ClipData.newHtmlText
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.BeachAccess
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Landscape
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Snowboarding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.triproom.ui.theme.TriproomTheme
import kotlin.math.round

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TriproomTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    Greeting()
                    Home()
                }
            }
        }
    }
}

@Composable
fun Greeting(){
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.End,
        verticalArrangement = Arrangement.SpaceBetween


    )
    {
        Row (
            modifier = Modifier
                .width(120.dp)
                .height(40.dp)
                .background(
                    color = Color(0xFF2BA0D2),
                    shape = RoundedCornerShape(bottomStart = 8.dp)
                ),

        ){
        }
    }
    Column(
        modifier = Modifier
            .padding(top = 204.dp)
            .padding(start = 16.dp)

    ){
        Text(
            text = "Login",
            fontSize = 48.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF2BA0D2)
        )
        Text(
            text = "Please sign in to continue.",
            color =  Color (0xffA09C9C)
        )

    }

    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 377.dp)
            .padding(start = 16.dp)
    ) {
        OutlinedTextField(
            value = "teste@email.com",
            onValueChange = {},
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color(0xFF2BA0D2)
            ),
            shape = RoundedCornerShape(16.dp),
            label = {
                Text(text = "Email")
            },
        )

        OutlinedTextField(
            modifier = Modifier
                .padding(top = 31.dp),
            value = "************",
            onValueChange = {},
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color(0xFF2BA0D2)
            ),
            shape = RoundedCornerShape(16.dp),
            label = {
                Text(text = "Password")

            },
        )

        Row (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .height(78.dp)
                    .width(134.dp)
                    .padding(top = 31.dp)
                    .padding(end = 10.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFF2BA0D2))
            ) {
                Text(
                    text = "SING IN",
                    fontSize = 16.sp
                )

                Icon(
                    imageVector = Icons.Filled.ArrowForward,
                    contentDescription = "botao sing in"
                )
            }
        }

        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 16.dp)
                .padding(top = 31.dp),
            horizontalArrangement = Arrangement.End
        ){

            Text(
                text = "Don’t have an account?",
                fontSize = 12.sp,
                color = Color(0xffA09C9C)
            )

            Text(
                text = "Sign up",
                color = Color(0xFF2BA0D2)
            )
        }

        Row (
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.Start
        ){
            Row (
                modifier = Modifier
                    .width(120.dp)
                    .height(40.dp)
                    .background(
                        color = Color(0xFF2BA0D2),
                        shape = RoundedCornerShape(topEnd = 8.dp)
                    ),
            ){

            }
        }


    }



}


@Composable
fun Home(){
    Column(
        modifier = Modifier.background(Color(0xFFF6F6F8))
    ){

        var pesquisarState = remember {
            mutableListOf("")
        }
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(197.dp)
        ){
            Image(
                painter = painterResource(id = R.drawable.paris),
                contentDescription = "foto paris",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )

            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 19.dp, vertical = 13.dp),
                horizontalAlignment = Alignment.End
            ){
                Card (
                    shape = CircleShape,
                    border = BorderStroke(width = 2.dp, Color(color = 0xffffffff)),
                    modifier = Modifier.size(61.dp)
                ) {
                    Image(painter = painterResource(id = R.drawable.person),
                        contentDescription = "Imagem do usuario")
                }
                Text(
                    text = "Susanna Hoffs",
                    color = Color(color = 0xffffffff),
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(19.dp),
                verticalArrangement = Arrangement.Bottom
            ) {
                Row (
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.LocationOn,
                        contentDescription = "Localização",
                        tint = Color.White,
                        modifier = Modifier.size(16.dp)
                    )

                    Text(
                        text = "You're in Paris",
                        color = Color.White,
                        fontSize = 14.sp
                    )
                }
                    Text(
                        text = "My Trips",
                        color = Color.White,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold
                    )
            }
        }
        Text(
            text = "Categories",
            fontSize = 18.sp,
            color = Color.Gray,
            modifier = Modifier
                .padding(horizontal = 14.dp, vertical = 10.dp)
        )
       LazyRow(
           modifier = Modifier
               .fillMaxWidth()

       ){
           item{ Card (
                modifier = Modifier
                    .size(150.dp, height = 84.dp)
                    .padding(horizontal = 9.dp),
               colors = CardDefaults.cardColors(Color(0xFF2BA0D2))
           ){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        imageVector = Icons.Default.Landscape,
                        contentDescription = "Montanhas",
                        tint = Color.White,
                        modifier = Modifier.size(42.dp)
                    )
                    Text(
                        text = "Montain",
                        color = Color.White
                    )
                }
           }}
           item{ Card (
               modifier = Modifier
                   .size(150.dp, height = 84.dp)
                   .padding(horizontal = 9.dp),
               colors = CardDefaults.cardColors(Color(0xFF73B6D2))
           ){
               Column (
                   modifier = Modifier.fillMaxSize(),
                   verticalArrangement = Arrangement.Center,
                   horizontalAlignment = Alignment.CenterHorizontally
               ) {
                   Icon(
                       imageVector = Icons.Default.Snowboarding,
                       contentDescription = "homem na neve",
                       tint = Color.White,
                       modifier = Modifier.size(42.dp)
                   )
                   Text(
                       text = "Snow",
                       color = Color.White
                   )
               }
           }}

           item{ Card (
               modifier = Modifier
                   .size(150.dp, height = 84.dp)
                   .padding(horizontal = 9.dp),
               colors = CardDefaults.cardColors(Color(0xFFB0DAEC))
           ){
               Column (
                   modifier = Modifier.fillMaxSize(),
                   verticalArrangement = Arrangement.Center,
                   horizontalAlignment = Alignment.CenterHorizontally
               ) {
                   Icon(
                       imageVector = Icons.Default.BeachAccess,
                       contentDescription = "Praia",
                       tint = Color.White,
                       modifier = Modifier.size(42.dp)
                   )
                   Text(
                       text = "Beach",
                       color = Color.White
                   )
               }
           }}
       }

        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            shape = RoundedCornerShape(30.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color(0xFFCCCFEB)
            ),
             placeholder = {
                 Text(
                     text = "Search your destiny",
                     color = Color.LightGray
                 )
             },
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "pesquisar",
                    tint = Color.LightGray
                )
            }
        )

        Text(
            text = "Past Trips",
            fontSize = 14.sp,
            color = Color.Gray,
            modifier = Modifier.padding(horizontal = 13.dp)
        )
        LazyColumn{
            item {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(13.dp),
                    colors = CardDefaults.cardColors(Color.White),
                    elevation = CardDefaults.elevatedCardElevation(defaultElevation = 16.dp)
                ) {
                    Column (
                        modifier = Modifier.fillMaxWidth()
                    ){
                        Card(
                            modifier = Modifier.fillMaxWidth(),
                            colors = CardDefaults.cardColors(Color.White)
                        ) {
                            Image(painter =  painterResource(id = R.drawable.london), contentDescription = "London")

                        }
                    }
                }
            }
        }




        }
    }



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    TriproomTheme {
        Home()
    }
}