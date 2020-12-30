package com.example.projet4a.presentation.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.projet4a.domain.usecase.GetUserUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class PersonnalViewModel (
        private val getUserUseCase: GetUserUseCase
) : ViewModel(){

    val accountLiveData : MutableLiveData<AccountStatus> = MutableLiveData()

    fun getUser(mail: String){
        viewModelScope.launch(Dispatchers.IO) {
            val user = getUserUseCase.invoke(mail)

            val accountStatus = if(user != null){
                AccountSuccess(user.email, user.password, user.LastName, user.Name)
            }else{
                AccountError
            }

            withContext(Dispatchers.Main){
                accountLiveData.value = accountStatus
            }
        }
    }
}