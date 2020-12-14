package com.example.simpleoopdiceandcalculator.calculator

import android.os.Bundle
import com.example.simpleoopdiceandcalculator.BaseActivity
import com.example.simpleoopdiceandcalculator.R
import kotlinx.android.synthetic.main.activity_calculator.*

class CalculatorActivity : BaseActivity() {

    private lateinit var calculator : Calculator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        calculator = Calculator(tv_input, tv_output)
        initializationListeners()
    }

    override fun initializationListeners() {
        btn_0.setOnClickListener {calculator.appendValueByClickButton(true, "0")}
        btn_1.setOnClickListener {calculator.appendValueByClickButton(true, "1")}
        btn_2.setOnClickListener {calculator.appendValueByClickButton(true, "2")}
        btn_3.setOnClickListener {calculator.appendValueByClickButton(true, "3")}
        btn_4.setOnClickListener {calculator.appendValueByClickButton(true, "4")}
        btn_5.setOnClickListener {calculator.appendValueByClickButton(true, "5")}
        btn_6.setOnClickListener {calculator.appendValueByClickButton(true, "6")}
        btn_7.setOnClickListener {calculator.appendValueByClickButton(true, "7")}
        btn_8.setOnClickListener {calculator.appendValueByClickButton(true, "8")}
        btn_9.setOnClickListener {calculator.appendValueByClickButton(true, "9")}
        btn_dot.setOnClickListener {calculator.appendValueByClickButton(true, ".")}

        btn_left_branch.setOnClickListener { calculator.appendValueByClickButton(false, "(") }
        btn_right_branch.setOnClickListener { calculator.appendValueByClickButton(false, ")") }
        btn_modulus.setOnClickListener { calculator.appendValueByClickButton(false, "%") }
        btn_multiplication.setOnClickListener { calculator.appendValueByClickButton(false, "*") }
        btn_division.setOnClickListener { calculator.appendValueByClickButton(false, "/") }
        btn_subtraction.setOnClickListener { calculator.appendValueByClickButton(false, "-") }
        btn_addition.setOnClickListener { calculator.appendValueByClickButton(false, "+") }

        btn_clear.setOnClickListener{
            calculator.clear()
        }

        btn_erase.setOnClickListener {
            calculator.erase()
        }

        btn_equal.setOnClickListener {
            calculator.calculate()
        }
    }


}