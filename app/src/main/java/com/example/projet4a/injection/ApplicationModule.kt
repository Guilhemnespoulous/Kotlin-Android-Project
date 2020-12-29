package com.example.projet4a.injection

import android.content.Context
import androidx.room.Room
import com.example.projet4a.data.local.AppDatabase
import com.example.projet4a.data.local.DatabaseDao
import com.example.projet4a.data.repository.UserRepository
import com.example.projet4a.domain.usecase.CreateUserUseCase
import com.example.projet4a.presentation.main.MainViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.Module
import org.koin.dsl.module
import java.security.AccessControlContext
val presentationModule = module {
    factory { MainViewModel(get()) }
}

val domainModule : Module = module {
    factory { CreateUserUseCase(get()) }
}

val dataModule : Module = module {
    single { UserRepository() }
    single { createDataBase(androidContext())}
}

fun createDataBase(context: Context): DatabaseDao {
    val appDatabase = Room.databaseBuilder(
        context,
        AppDatabase::class.java, "database-name"
    ).build()
    return appDatabase.databaseDao()
}
