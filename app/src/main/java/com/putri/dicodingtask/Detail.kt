package com.putri.dicodingtask

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.putri.dicodingtask.objects.Makanan
import com.putri.dicodingtask.objects.MakananData


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Detail(navController : NavController, id : String){
    val data : Makanan? = MakananData.makanan.find { it.id == id }
    Log.d("RESPONSE","${data.toString()} ||| ID : ${id}")
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LazyColumn() {
            stickyHeader {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(MaterialTheme.colorScheme.primary)
                        .padding(vertical = 5.dp), horizontalArrangement = Arrangement.Start
                ) {
                    Button(onClick = { navigateBackStack(navController) }) {
                        Image(
                            painter = painterResource(id = R.drawable.baseline_arrow_back_24),
                            modifier = Modifier.size(30.dp),
                            contentDescription = "Back Home"
                        )
                    }

                }

            }
        }
        Spacer(modifier = Modifier.padding(20.dp))

        AsyncImage(model = data?.foto, contentDescription = data?.judul, modifier = Modifier.clip(CircleShape).size(300.dp))

        Spacer(modifier = Modifier.padding(20.dp))

        Text(text = "${data?.judul}", textAlign = TextAlign.Center)
        Text(text =  "${data?.detail}", textAlign = TextAlign.Center)

    }
}

