package com.example.contactsmanager.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.contactsmanager.uii.Home
import com.example.contactsmanager.uii.Splash
import com.example.contactsmanager.viewmodel.ContactState
import com.example.contactsmanager.viewmodel.ContactViewModel

@Composable
fun NavGraph(
    navHostController: NavHostController,
    viewModel: ContactViewModel,
    state : ContactState,
    onEvent : () -> Unit
){
    NavHost(navController = navHostController, startDestination = Routes.Splash.routes){

        composable(Routes.Splash.routes){
            Splash(navHostController = navHostController)
        }

        composable(Routes.Home.routes){
            Home(state = state,
                viewModel = viewModel
            ){
                onEvent()
            }
        }
    }
}