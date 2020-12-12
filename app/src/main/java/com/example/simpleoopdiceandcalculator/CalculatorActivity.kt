package com.example.simpleoopdiceandcalculator

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_calculator.*
import net.objecthunter.exp4j.ExpressionBuilder

class CalculatorActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        initializationListeners()
    }

    override fun initializationListeners() {
        super.initializationListeners()

        btn_0.setOnClickListener {appendValueByClickButton(true, "0")}
        btn_1.setOnClickListener {appendValueByClickButton(true, "1")}
        btn_2.setOnClickListener {appendValueByClickButton(true, "2")}
        btn_3.setOnClickListener {appendValueByClickButton(true, "3")}
        btn_4.setOnClickListener {appendValueByClickButton(true, "4")}
        btn_5.setOnClickListener {appendValueByClickButton(true, "5")}
        btn_6.setOnClickListener {appendValueByClickButton(true, "6")}
        btn_7.setOnClickListener {appendValueByClickButton(true, "7")}
        btn_8.setOnClickListener {appendValueByClickButton(true, "8")}
        btn_9.setOnClickListener {appendValueByClickButton(true, "9")}
        btn_dot.setOnClickListener {appendValueByClickButton(true, ".")}

        btn_left_branch.setOnClickListener { appendValueByClickButton(false, "(") }
        btn_right_branch.setOnClickListener { appendValueByClickButton(false, ")") }
        btn_modulus.setOnClickListener { appendValueByClickButton(false, "%") }
        btn_multiplication.setOnClickListener { appendValueByClickButton(false, "*") }
        btn_division.setOnClickListener { appendValueByClickButton(false, "/") }
        btn_subtraction.setOnClickListener { appendValueByClickButton(false, "-") }
        btn_addition.setOnClickListener { appendValueByClickButton(false, "+") }

        btn_clear.setOnClickListener{
            clear()
        }

        btn_clear_1.setOnClickListener {
            remove()
        }

        btn_equal.setOnClickListener {
            calculate()
        }
    }

    private fun appendValueByClickButton(btnType:Boolean, str: String) {
        if(tv_output.text.isNotEmpty()){
            tv_input.text = ""
        }
        if(btnType) {
            tv_output.text = ""
            tv_input.append(str)
        } else {
            tv_input.append(tv_output.text)
            tv_input.append(str)
            tv_output.text = ""
        }
    }

    private fun clear() {
        tv_input.text = ""
        tv_output.text = ""
    }

   private fun remove() {
       val string = tv_input.text.toString()
       if(string.isNotEmpty()) {
           tv_input.text = string.substring(0, string.length-1)
       }
       tv_output.text = ""
   }

    private fun calculate() {
        try {
            val input = ExpressionBuilder(tv_input.text.toString()).build()
            val output = input.evaluate()
            val longOutput = output.toLong()

            if(output == longOutput.toDouble()) {
                tv_output.text = longOutput.toString()
            } else {
                tv_output.text = output.toString()
            }
        } catch (error:Exception) {
            Toast.makeText(this@CalculatorActivity, error.message, Toast.LENGTH_LONG).show()
        }
    }

}