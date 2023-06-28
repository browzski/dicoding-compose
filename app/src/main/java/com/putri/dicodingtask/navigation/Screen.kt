package com.putri.dicodingtask.navigation

sealed class Screen(val route: String) {
    object About : Screen("about")
    object Home : Screen("home")
    object Detail : Screen("detail/{id}"){
        fun createRoute(id : String) = "detail/$id"
    }

}