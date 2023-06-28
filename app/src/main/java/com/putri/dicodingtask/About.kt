package com.putri.dicodingtask

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.res.TypedArrayUtils.getString
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.putri.dicodingtask.navigation.Screen


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun About(navController: NavController) {
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

        Image(
            painter = painterResource(id = R.drawable.fotoprofil),
            contentScale = ContentScale.Crop,
            contentDescription = stringResource(R.string.about_foto),
            modifier = Modifier
                .size(300.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.padding(20.dp))

        Text(text = stringResource(R.string.about_nama), textAlign = TextAlign.Center)
        Text(text = stringResource(R.string.about_email), textAlign = TextAlign.Center)

    }
}

fun navigateBackStack(navController: NavController) {
    navController.navigate(Screen.Home.route) {
        popUpTo(navController.graph.id) {
            inclusive = true
        }
    }
}

@Preview
@Composable
fun PreviewGreeting() {
    About(navController = rememberNavController())
}
