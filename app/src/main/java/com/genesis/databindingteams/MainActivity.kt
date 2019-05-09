package com.genesis.databindingteams

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //https://medium.com/@jencisov/androids-data-binding-with-kotlin-df94a24ffc0f
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)



    }

    fun addOneA(){

    }

    fun addOneB(){

    }

    fun addTwoA(){

    }

    fun addTwoB(){

    }

    fun addThreeA(){

    }

    fun addThreeB(){

    }

    fun reset(){

    }

}
