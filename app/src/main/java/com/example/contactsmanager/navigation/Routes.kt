package com.example.contactsmanager.navigation

sealed class Routes (var routes : String){
    object Home : Routes("home")

    object Splash : Routes("splash")
}