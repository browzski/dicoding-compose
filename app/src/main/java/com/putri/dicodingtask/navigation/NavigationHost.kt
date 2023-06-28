package com.putri.dicodingtask.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.putri.dicodingtask.About
import com.putri.dicodingtask.Detail
import com.putri.dicodingtask.Home

@Composable
fun NavigationHost(navController: NavHostController){
    NavHost(navController = navController, startDestination = Screen.Home.route){
        composable(Screen.Home.route){
            Home(navController = navController)
        }
        composable(Screen.About.route){
            About(navController = navController)
        }
        composable(
            route = Screen.Detail.route,
            arguments = listOf(navArgument("id"){type = NavType.StringType})
        ){
            Detail(navController = navController, id = it.arguments?.getString("id") ?: "")
        }

    }
}