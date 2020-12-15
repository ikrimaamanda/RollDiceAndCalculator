package com.example.simpleoopdiceandcalculator.dice

import android.widget.ImageView
import android.widget.TextView
import com.example.simpleoopdiceandcalculator.R
import java.util.*

class Dice(private val diceImage: ImageView, private val tvResult : TextView ) {

    fun rollDice() {
        val randomNumber = Random().nextInt(6)+1

        when(randomNumber) {
            1-> {
                tvResult.setText("One")
                diceImage.setImageResource(R.drawable.dice_one)
            }
            2-> {
                tvResult.setText("Two")
                diceImage.setImageResource(R.drawable.dice_two)
            }
            3-> {
                tvResult.setText("Three")
                diceImage.setImageResource(R.drawable.dice_three)
            }
            4-> {
                tvResult.setText("Four")
                diceImage.setImageResource(R.drawable.dice_four)
            }
            5-> {
                tvResult.setText("Five")
                diceImage.setImageResource(R.drawable.dice_five)
            }
            else-> {
                tvResult.setText("Six")
                diceImage.setImageResource(R.drawable.dice_six)
            }
        }
    }

}