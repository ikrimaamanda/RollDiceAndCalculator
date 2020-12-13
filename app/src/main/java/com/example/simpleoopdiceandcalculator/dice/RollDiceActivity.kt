package com.example.simpleoopdiceandcalculator.dice

import android.os.Bundle
import com.example.simpleoopdiceandcalculator.BaseActivity
import com.example.simpleoopdiceandcalculator.R
import kotlinx.android.synthetic.main.activity_roll_dice.*

class RollDiceActivity : BaseActivity() {

    private  lateinit var dice: Dice

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_roll_dice)
        dice = Dice(iv_dice, tv_result)
        initializationListeners()
    }

    override fun initializationListeners() {
        super.initializationListeners()

        btn_roll_dice.setOnClickListener {
            dice.rollDice()
        }
    }
}