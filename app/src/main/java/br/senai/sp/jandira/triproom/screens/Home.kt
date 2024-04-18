package br.senai.sp.jandira.triproom.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BeachAccess
import androidx.compose.material.icons.filled.Landscape
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Snowboarding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.triproom.R


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
            }
            }
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
            }
            }

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
            }
            }
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
                            Image(painter =  painterResource(id = R.drawable.img), contentDescription = "London",
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(6.dp),
                                contentScale = ContentScale.Crop
                            )
                        }
                        Text(
                            text = "London, 2019",
                            fontSize = 16.sp,
                            color = Color(0xFF2BA0D2),
                            modifier = Modifier.padding(start = 5.dp)
                        )
                        Text(
                            text = "London is the capital and largest city of the United Kingdom, with a population of just under 9 million.",
                            fontSize = 11.sp,
                            color = Color(0xFFA09C9C),
                            lineHeight = 12.sp,
                            modifier = Modifier.padding(start = 5.dp)
                        )

                        Column (
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp),
                            horizontalAlignment = Alignment.End
                        ) {
                            Text(
                                text = "18 Feb - 21 Feb",
                                fontSize = 11.sp,
                                color = Color(0xFF2BA0D2)
                            )
                        }
                    }
                }
            }

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
                            Image(painter =  painterResource(id = R.drawable.porto), contentDescription = "London",
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(6.dp),
                                contentScale = ContentScale.Crop
                            )
                        }
                        Text(
                            text = "Porto, 2022",
                            fontSize = 16.sp,
                            color = Color(0xFF2BA0D2),
                            modifier = Modifier.padding(start = 5.dp)
                        )
                        Text(
                            text = "Porto is the second city in Portugal, the capital of the Oporto District, and one of the Iberian Peninsula's major urban areas.",
                            fontSize = 11.sp,
                            color = Color(0xFFA09C9C),
                            lineHeight = 12.sp,
                            modifier = Modifier.padding(start = 5.dp)
                        )

                        Column (
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp),
                            horizontalAlignment = Alignment.End
                        ) {
                            Text(
                                text = "18 Feb - 21 Feb",
                                fontSize = 11.sp,
                                color = Color(0xFF2BA0D2)
                            )
                        }
                    }
                }
            }
        }

    }
}
