package com.genesis.databindingteams

import androidx.lifecycle.ViewModel

//data class Equipos(val puntosEquipoA:Int, val puntosEquipoB:Int)
/*
class Equipos {

    var puntosEquipoA: Int?
    var puntosEquipoB: Int?

    init {
        puntosEquipoA = 0.toInt()
        puntosEquipoB = 0.toInt()
    }

    constructor(puntosEquipoA: Int?, puntosEquipoB: Int?) {
        this.puntosEquipoA = puntosEquipoA
        this.puntosEquipoB = puntosEquipoB
    }
}
*/

class Equipos : ViewModel() {
    var puntosEquipoA = 0
    var puntosEquipoB = 0
}