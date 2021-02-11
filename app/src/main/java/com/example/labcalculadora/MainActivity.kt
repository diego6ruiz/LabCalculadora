package com.example.labcalculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var operador: Boolean = false
        var operacion: String = ""

        val printVal1: TextView = findViewById(R.id.TxtValue)

        val btn0: Button = findViewById(R.id.btn0)
        val btn1: Button = findViewById(R.id.btn1)
        val btn2: Button = findViewById(R.id.btn2)
        val btn3: Button = findViewById(R.id.btn3)
        val btn4: Button = findViewById(R.id.btn4)
        val btn5: Button = findViewById(R.id.btn5)
        val btn6: Button = findViewById(R.id.btn6)
        val btn7: Button = findViewById(R.id.btn7)
        val btn8: Button = findViewById(R.id.btn8)
        val btn9: Button = findViewById(R.id.btn9)

        val btnC: Button = findViewById(R.id.btnC)

        val btnMas: Button = findViewById(R.id.btnMas)
        val btnMenos: Button = findViewById(R.id.btnMenos)
        val btnMulti: Button = findViewById(R.id.btnMulti)
        val btnDivis: Button = findViewById(R.id.btnDivis)
        val btnIgual: Button = findViewById(R.id.btnIgual)

        var registro: String = ""
        var val1: String = ""
        var num1: Double = 0.0
        var num2: Double = 0.0
        var rslt: Double = 0.0
        var rsltStr: String


        btn0.setOnClickListener {
            if(val1==""){
                val1="0"
            }
            else{
                registro = "0"
                val1+= registro
                printVal1.text = val1
            }
        }
        btn1.setOnClickListener {
            if(val1=="0"){
                val1="1"
                printVal1.text = val1
            } else {
                registro = "1"
                val1 += registro
                printVal1.text = val1
            }
        }
        btn2.setOnClickListener {
            if(val1=="0"){
                val1="2"
                printVal1.text = val1
            } else {
                registro = "2"
                val1 += registro
                printVal1.text = val1
            }
        }
        btn3.setOnClickListener {
            if(val1=="0"){
                val1="3"
                printVal1.text = val1
            } else {
                registro = "3"
                val1 += registro
                printVal1.text = val1
            }
        }
        btn4.setOnClickListener {
            if(val1=="0"){
                val1="4"
                printVal1.text = val1
            } else {
                registro = "4"
                val1 += registro
                printVal1.text = val1
            }
        }
        btn5.setOnClickListener {
            if(val1=="0"){
                val1="5"
                printVal1.text = val1
            } else {
                registro = "5"
                val1 += registro
                printVal1.text = val1
            }
        }
        btn6.setOnClickListener {
            if(val1=="0"){
                val1="6"
                printVal1.text = val1
            } else {
                registro = "6"
                val1 += registro
                printVal1.text = val1
            }
        }
        btn7.setOnClickListener {
            if(val1=="0"){
                val1="7"
                printVal1.text = val1
            } else {
                registro = "7"
                val1 += registro
                printVal1.text = val1
            }
        }
        btn8.setOnClickListener {
            if(val1=="0"){
                val1="8"
                printVal1.text = val1
            } else {
                registro = "8"
                val1 += registro
                printVal1.text = val1
            }
        }
        btn9.setOnClickListener {
            if(val1=="0"){
                val1="9"
                printVal1.text = val1
            } else {
                registro = "9"
                val1 += registro
                printVal1.text = val1
            }
        }

        btnC.setOnClickListener {
            val1 = ""
            printVal1.text = val1
        }


        btnMas.setOnClickListener {
            if(val1 ==""){
                num1=0.0
            } else{
                num1 = val1.toDouble()
            }
            val1 = ""
            printVal1.text = val1
            operacion = "suma"
        }
        btnMenos.setOnClickListener {
            if(val1 ==""){
                num1=0.0
            } else{
                num1 = val1.toDouble()
            }
            val1 = ""
            printVal1.text = val1
            operacion = "resta"
        }
        btnMulti.setOnClickListener {
            if(val1 ==""){
                num1=0.0
            } else{
                num1 = val1.toDouble()
            }
            val1 = ""
            printVal1.text = val1
            operacion = "multiplicacion"
        }
        btnDivis.setOnClickListener {
            if(val1 ==""){
                num1=0.0
            } else{
                num1 = val1.toDouble()
            }
            val1 = ""
            printVal1.text = val1
            operacion = "division"
        }
        btnIgual.setOnClickListener {
            num2 = val1.toDouble()
            if(operacion == "suma"){
                rslt = num1+num2
            }
            else if(operacion == "resta"){
                rslt = num1-num2
            }
            else if(operacion == "multiplicacion"){
                rslt = num1*num2
            }
            else if(operacion == "division"){
                rslt = num1/num2
            }
            else if (operacion == ""){
                printVal1.text = val1
            }
            rsltStr = rslt.toString()
            printVal1.text = rsltStr
            val1 = rsltStr

        }











    }


}