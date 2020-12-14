package com.example.simpleoopdiceandcalculator.calculator

import android.widget.TextView
import net.objecthunter.exp4j.ExpressionBuilder

class Calculator(var tvInput : TextView, var tvOutput : TextView) {

    fun appendValueByClickButton(btnType:Boolean, str: String) {
        if(tvOutput.text.isNotEmpty()){
            tvInput.text = ""
        }
        if(btnType) {
            tvOutput.text = ""
            tvInput.append(str)
        } else {
            tvInput.append(tvOutput.text)
            tvInput.append(str)
            tvOutput.text = ""
        }
    }

    fun clear() {
        tvInput.text = ""
        tvOutput.text = ""
    }

    fun erase() {
        val string = tvInput.text
        if(string.isNotEmpty()) {
            tvInput.text = string.substring(0, string.length-1)
        }
        tvOutput.text = ""
    }

    fun calculate() {
            val input = ExpressionBuilder(tvInput.text.toString()).build()
            val output = input.evaluate()
            val longOutput = output.toLong()

            if(output == longOutput.toDouble()) {
                tvOutput.text = longOutput.toString()
            } else {
                tvOutput.text = output.toString()
            }
    }
}