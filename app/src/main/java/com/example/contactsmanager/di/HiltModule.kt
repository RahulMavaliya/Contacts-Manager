package com.example.contactsmanager.di

import android.app.Application
import androidx.room.Room
import com.example.contactsmanager.database.ContactDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object HiltModule {

    @Provides
    fun provideDatabase(application : Application) : ContactDatabase{

        return Room.databaseBuilder(application,
            ContactDatabase::class.java,
            "ContactApp.db"
        ).fallbackToDestructiveMigrationFrom(1).build()
    }
}