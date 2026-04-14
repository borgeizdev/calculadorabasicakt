package com.guitiscaleo.calculadorabasicakt

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var num1 = 0.0
    var num2 = 0.0
    var operacao = ""
    var novoNumero = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val res = findViewById<TextView>(R.id.res)

        // BOTÕES NUMÉRICOS

        findViewById<Button>(R.id.btn0).setOnClickListener {
            if (novoNumero) {
                res.text = "0"
                novoNumero = false
            } else {
                res.text = res.text.toString() + "0"
            }
        }

        findViewById<Button>(R.id.btn1).setOnClickListener {
            if (novoNumero) {
                res.text = "1"
                novoNumero = false
            } else {
                res.text = res.text.toString() + "1"
            }
        }

        findViewById<Button>(R.id.btn2).setOnClickListener {
            if (novoNumero) {
                res.text = "2"
                novoNumero = false
            } else {
                res.text = res.text.toString() + "2"
            }
        }

        findViewById<Button>(R.id.btn3).setOnClickListener {
            if (novoNumero) {
                res.text = "3"
                novoNumero = false
            } else {
                res.text = res.text.toString() + "3"
            }
        }

        findViewById<Button>(R.id.btn4).setOnClickListener {
            if (novoNumero) {
                res.text = "4"
                novoNumero = false
            } else {
                res.text = res.text.toString() + "4"
            }
        }

        findViewById<Button>(R.id.btn5).setOnClickListener {
            if (novoNumero) {
                res.text = "5"
                novoNumero = false
            } else {
                res.text = res.text.toString() + "5"
            }
        }

        findViewById<Button>(R.id.btn6).setOnClickListener {
            if (novoNumero) {
                res.text = "6"
                novoNumero = false
            } else {
                res.text = res.text.toString() + "6"
            }
        }

        findViewById<Button>(R.id.btn7).setOnClickListener {
            if (novoNumero) {
                res.text = "7"
                novoNumero = false
            } else {
                res.text = res.text.toString() + "7"
            }
        }

        findViewById<Button>(R.id.btn8).setOnClickListener {
            if (novoNumero) {
                res.text = "8"
                novoNumero = false
            } else {
                res.text = res.text.toString() + "8"
            }
        }

        findViewById<Button>(R.id.btn9).setOnClickListener {
            if (novoNumero) {
                res.text = "9"
                novoNumero = false
            } else {
                res.text = res.text.toString() + "9"
            }
        }

        // OPERAÇÕES

        findViewById<Button>(R.id.btnadd).setOnClickListener {
            if (res.text.toString() != "") {
                num1 = res.text.toString().toDouble()
                operacao = "+"
                res.text = ""
            }
        }

        findViewById<Button>(R.id.btnmenos).setOnClickListener {
            if (res.text.toString() != "") {
                num1 = res.text.toString().toDouble()
                operacao = "-"
                res.text = ""
            }
        }

        findViewById<Button>(R.id.btnmult).setOnClickListener {
            if (res.text.toString() != "") {
                num1 = res.text.toString().toDouble()
                operacao = "*"
                res.text = ""
            }
        }

        findViewById<Button>(R.id.btndiv).setOnClickListener {
            if (res.text.toString() != "") {
                num1 = res.text.toString().toDouble()
                operacao = "/"
                res.text = ""
            }
        }

        // IGUAL

        findViewById<Button>(R.id.btnigual).setOnClickListener {
            if (res.text.toString() != "") {

                num2 = res.text.toString().toDouble()
                var resultado = 0.0

                when (operacao) {
                    "+" -> resultado = num1 + num2
                    "-" -> resultado = num1 - num2
                    "*" -> resultado = num1 * num2
                    "/" -> {
                        if (num2 == 0.0) {
                            res.text = "Erro"
                        } else {
                            resultado = num1 / num2
                        }
                    }
                }

                if (!(operacao == "/" && num2 == 0.0)) {

                    // se resultado redondo tira o .0 do fim
                    if (resultado % 1 == 0.0) {
                        res.text = resultado.toInt().toString()
                    } else {
                        res.text = resultado.toString()
                    }

                    novoNumero = true
                }
            }
        }

        // LIMPAR (com while)

        findViewById<Button>(R.id.btnclear).setOnClickListener {

            var i = 0
            while (i < 1) {
                res.text = ""
                num1 = 0.0
                num2 = 0.0
                operacao = ""
                novoNumero = false
                i++
            }

        }
    }
}