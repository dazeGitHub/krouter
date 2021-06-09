package com.github.denisidoro.sample

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class UserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        val user: Int = intent.getIntExtra("id", 0)
        (findViewById<TextView>(R.id.helloTV)).text = "Your user id is $user"
    }
}
