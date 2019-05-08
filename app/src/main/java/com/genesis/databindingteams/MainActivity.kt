package com.genesis.databindingteams

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        PuntosEquipo binding = DataBindingUtil.setContentView(this, R.layout.activity_main)




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
