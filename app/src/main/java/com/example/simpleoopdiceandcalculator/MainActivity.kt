package com.example.simpleoopdiceandcalculator

import android.content.Intent
import android.os.Bundle
import com.example.simpleoopdiceandcalculator.calculator.CalculatorActivity
import com.example.simpleoopdiceandcalculator.dice.RollDiceActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializationListeners()
    }

    override fun initializationListeners() {
        super.initializationListeners()
        btn_roll_dice.setOnClickListener {
            val intentRollDice = Intent(this, RollDiceActivity::class.java)
            startActivity(intentRollDice)
        }

        btn_calculator.setOnClickListener {
            val intentCalculator = Intent(this, CalculatorActivity::class.java)
            startActivity(intentCalculator)
        }
    }
}