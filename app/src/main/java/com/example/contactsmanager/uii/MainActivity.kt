package com.example.contactsmanager.uii

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.rememberNavController
import com.example.contactsmanager.navigation.NavGraph
import com.example.contactsmanager.ui.theme.ContactsManagerTheme
import com.example.contactsmanager.viewmodel.ContactViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            val viewModel = hiltViewModel<ContactViewModel>()
            val state = viewModel.state.collectAsState().value
            val navHostController = rememberNavController()

            ContactsManagerTheme {
                Scaffold(
                    containerColor = Color.White,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color.White)
                ) { innerPadding ->
                    innerPadding
                    NavGraph (
                        navHostController = navHostController,
                        state = state,
                        viewModel = viewModel
                    ) {
                        viewModel.saveContact()
                    }
                }
            }
        }
    }
}
