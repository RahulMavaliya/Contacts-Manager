package com.example.contactsmanager.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.mutableStateOf
import com.example.contactsmanager.database.Contact

data class ContactState(
    val contact :List<Contact> = emptyList(),
    val id : MutableState<Int> = mutableIntStateOf(0),
    val name : MutableState<String> = mutableStateOf(""),
    val number : MutableState<String> = mutableStateOf(""),
    val gmail : MutableState<String> = mutableStateOf(""),
    val dateOfCreation : MutableState<Long> = mutableLongStateOf(0),
    val image : MutableState<ByteArray> = mutableStateOf(ByteArray(0))
)