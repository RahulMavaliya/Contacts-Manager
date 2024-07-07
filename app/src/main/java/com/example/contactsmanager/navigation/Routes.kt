package com.example.contactsmanager.navigation

sealed class Routes (val routes : String){
    object Home : Routes("home")

    object Splash : Routes("splash")
}