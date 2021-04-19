package com.example.android.guesstheword.screens.game

import android.util.Log
import androidx.lifecycle.ViewModel

/** Create the GameViewModel class, extending ViewModel */
class GameViewModel : ViewModel() {

    /** Add init block and override onCleared */
    init {
        Log.i("GameViewModel", "GameViewModel created!")
    }
    override fun onCleared() {
        super.onCleared()
        Log.i("GameViewModel", "GameViewModel destroyed!")
    }
}