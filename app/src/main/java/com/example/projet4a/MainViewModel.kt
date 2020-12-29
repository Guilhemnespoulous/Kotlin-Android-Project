package com.example.projet4a

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel(){

    val texte: MutableLiveData<String> = MutableLiveData()

    init{
        texte.value = "Test de texte"
    }
}