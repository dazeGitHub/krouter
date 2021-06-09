package com.github.denisidoro.sample

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fab = findViewById<Button>(R.id.fab)
        fab.setOnClickListener { app.krouter.start("user/42") }

        val f = app.krouter.getRouter("fragment")!!
                .withBundle {
                    it.putInt("id", 18)
                    it.putString("name", "Shadow")
                }
                .fragment()
        if(supportFragmentManager.findFragmentByTag("fragment") == null) {
            supportFragmentManager.beginTransaction()
                    .add(R.id.container, f, "fragment")
                    .commit()
        }
    }

}
