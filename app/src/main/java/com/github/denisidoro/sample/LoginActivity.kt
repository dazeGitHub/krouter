package com.github.denisidoro.sample

import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        findViewById<View>(R.id.btnLogin).setOnClickListener {
            app.login = true
            val url = intent.getStringExtra("nav")
            if(!TextUtils.isEmpty(url)) {
                Toast.makeText(this, "Login success, should nav $url", Toast.LENGTH_LONG).show()
                app.krouter.start(intent.getStringExtra("nav"))
            }else {
                Toast.makeText(this, "Login success", Toast.LENGTH_LONG).show()
            }
            finish()
        }
    }
}
