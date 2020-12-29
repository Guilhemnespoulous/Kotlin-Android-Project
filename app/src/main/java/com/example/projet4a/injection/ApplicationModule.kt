package com.example.projet4a.injection

import com.example.projet4a.data.repository.UserRepository
import com.example.projet4a.domain.usecase.CreateUserUseCase
import com.example.projet4a.presentation.main.MainViewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val presentationModule = module {
    factory { MainViewModel(get()) }
}

val domainModule : Module = module {
    factory { CreateUserUseCase(get()) }
}


val dataModule : Module = module {
    single { UserRepository() }
}
