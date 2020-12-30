package com.example.projet4a.presentation.main

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.projet4a.R
import com.example.projet4a.domain.entity.User
import org.koin.android.ext.android.inject

class PersonnalActivity : AppCompatActivity(){

    val personnalViewModel : PersonnalViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personnal)

        val user = intent.getSerializableExtra("key") as User

        findViewById<TextView>(R.id.textView).apply {
            text = "Email: " + user.email
        }
        findViewById<TextView>(R.id.password).apply {
            text = "Password: " + user.password
        }
        findViewById<TextView>(R.id.lastName).apply {
            text = "Last Name: " + user.LastName
        }
        findViewById<TextView>(R.id.name).apply {
            text = "First Name: " + user.Name
        }


    }
}
