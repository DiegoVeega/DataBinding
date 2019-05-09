package com.genesis.databindingteams

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.genesis.databindingteams.databinding.MainActivityBinding


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)
        var binding: MainActivityBinding = DataBindingUtil.setContentView<MainActivityBinding>(this,R.layout.main_activity)

        var Equipo = Equipos(0,0)
        binding.puntos = Equipo
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
