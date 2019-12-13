package com.bryanollivie.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bryanollivie.sdk.Actions

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //etContentView(R.layout.activity_onboard)

        //startActivity(Actions.openLoginIntent(this))
        startActivity(Actions.openBooksIntent(this))
    }
}
