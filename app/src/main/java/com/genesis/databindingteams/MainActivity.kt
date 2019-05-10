package com.genesis.databindingteams

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.genesis.databindingteams.databinding.MainActivityBinding
import kotlinx.android.synthetic.main.main_activity.*
import android.view.View
import androidx.lifecycle.ViewModelProviders


class MainActivity : AppCompatActivity() {

    lateinit var puntuacion : Equipos

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.main_activity)
        //var binding: MainActivityBinding = DataBindingUtil.setContentView<MainActivityBinding>(this,R.layout.main_activity)

        val binding = MainActivityBinding.inflate(layoutInflater)

        puntuacion = ViewModelProviders.of(this).get(puntuacion::class.java)
        binding.btTeamA1.text = puntuacion.puntosEquipoA.toString()
        binding.btTeamA1.text = puntuacion.puntosEquipoB.toString()
        binding.puntos = puntuacion
    }

    fun addOneA(v: View){

        puntuacion.puntosEquipoA =+1

    }

    fun addOneB(v: View){
        puntuacion.puntosEquipoB =+ 1
    }

    fun addTwoA(v: View){
        puntuacion.puntosEquipoA =+ 2
    }

    fun addTwoB(v: View){
        puntuacion.puntosEquipoA =+ 2
    }

    fun addThreeA(v: View){
        puntuacion.puntosEquipoA =+ 3
    }

    fun addThreeB(v: View){
        puntuacion.puntosEquipoA =+ 3
    }

    fun reset(v: View){
        puntuacion.puntosEquipoA = 0
        puntuacion.puntosEquipoB = 0
    }

}
