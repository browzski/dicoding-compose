package com.putri.dicodingtask

import android.os.Bundle
import android.provider.CalendarContract.Colors
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import com.putri.dicodingtask.navigation.Screen
import com.putri.dicodingtask.objects.MakananData
import com.putri.dicodingtask.ui.theme.DicodingTaskTheme

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Home(navController: NavController) {

    LazyColumn() {

        stickyHeader {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.primary)
                    .padding(horizontal = 10.dp, vertical = 5.dp),
                horizontalArrangement = Arrangement.End
            ) {
                Button(onClick = { navigateToDetails(navController) }) {

                    Image(
                        painter = painterResource(id = R.drawable.baseline_account_circle_24),
                        modifier = Modifier
                            .size(40.dp),
                        contentDescription = "Foto"
                    )
                }

            }

        }
        items(MakananData.makanan, key = { it.id }) { makanan ->
            Spacer(modifier = Modifier.height(40.dp))
            Button(onClick = { navigateToAbout(navController,makanan.id) }) {
                RowMakanan(foto = makanan.foto, judul = makanan.judul)
            }

        }

    }
}

@Composable
fun RowMakanan(
    foto: String,
    judul: String
) {
    Column(

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        Spacer(modifier = Modifier.height(20.dp))
        AsyncImage(model = foto, contentDescription = judul, modifier = Modifier.clip(CircleShape))
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = judul,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Light,
            color = Color.Black,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(80.dp))

    }
}

fun navigateToDetails(navController: NavController) {
    navController.navigate(Screen.About.route)
}

fun navigateToAbout(navController: NavController,id : String){

    navController.navigate(Screen.Detail.createRoute(id))
}

