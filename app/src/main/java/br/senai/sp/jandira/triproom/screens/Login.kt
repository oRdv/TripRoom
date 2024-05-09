package br.senai.sp.jandira.triproom.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.triproom.R
import br.senai.sp.jandira.triproom.ui.theme.TriproomTheme

@Composable
fun Login() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.End,
        verticalArrangement = Arrangement.SpaceBetween

    )
    {
        Row(
            modifier = Modifier
                .width(120.dp)
                .height(40.dp)
                .background(
                    color = Color(0xFF2BA0D2),
                    shape = RoundedCornerShape(bottomStart = 8.dp)
                ),

            ) {
        }
    }
    Column(
        modifier = Modifier
            .padding(top = 204.dp)
            .padding(start = 16.dp)

    ) {
        Text(
            text = stringResource(id = R.string.trip_login),
            fontSize = 48.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF2BA0D2)
        )
        Text(
            text = stringResource(id = R.string.trip_signup),
            color = Color(0xffA09C9C)
        )

    }

    Column(
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

        Row(
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

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 16.dp)
                .padding(top = 31.dp),
            horizontalArrangement = Arrangement.End
        ) {

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

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.Start
        ) {
            Row(
                modifier = Modifier
                    .width(120.dp)
                    .height(40.dp)
                    .background(
                        color = Color(0xFF2BA0D2),
                        shape = RoundedCornerShape(topEnd = 8.dp)
                    ),
            ) {

            }
        }


    }

}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    TriproomTheme {
        Login()
    }
}