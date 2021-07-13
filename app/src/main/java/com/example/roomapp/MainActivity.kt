package com.example.roomapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(applicationContext,"Starting main function",Toast.LENGTH_LONG).show()
        /*GlobalScope.launch {
            println(doSomething())
        }

        runBlocking {
            delay(4000L)
        }*/


        //setupActionBarWithNavController(findNavController(R.id.fragment))
    }

    suspend fun doSomething():String{
        delay(3000L)
        return "Did somethin 3 secs long"
    }
    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.fragment)
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}