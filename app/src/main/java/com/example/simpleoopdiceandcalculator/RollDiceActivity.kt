package com.example.simpleoopdiceandcalculator

import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_roll_dice.*
import java.util.*

class RollDiceActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_roll_dice)
        initializationListeners()
    }

    override fun initializationListeners() {
        super.initializationListeners()

        btn_roll_dice.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val diceImage : ImageView = findViewById(R.id.iv_dice)
        val randomNumber = Random().nextInt(6)+1

        when(randomNumber) {
            1-> {
                tv_result.setText("One")
                diceImage.setImageResource(R.drawable.dice_one)
            }
            2-> {
                tv_result.setText("Two")
                diceImage.setImageResource(R.drawable.dice_two)
            }
            3-> {
                tv_result.setText("Three")
                diceImage.setImageResource(R.drawable.dice_three)
            }
            4-> {
                tv_result.setText("Four")
                diceImage.setImageResource(R.drawable.dice_four)
            }
            5-> {
                tv_result.setText("Five")
                diceImage.setImageResource(R.drawable.dice_five)
            }
            else-> {
                tv_result.setText("Six")
                diceImage.setImageResource(R.drawable.dice_six)
            }
        }
    }

}