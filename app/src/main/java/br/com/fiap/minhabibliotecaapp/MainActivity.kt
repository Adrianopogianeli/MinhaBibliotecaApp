package br.com.fiap.minhabibliotecaapp

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import br.com.fiap.minhabiblioteca.Calculadora
import br.com.fiap.minhabiblioteca.CustomToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var calc = Calculadora()
        var resultado = calc.somar(1,1)
        var alerta : String = resultado.toString()

        val texto : TextView =  findViewById<TextView>(R.id.texto)
        texto.text = alerta

        CustomToast().showToast(applicationContext,alerta)


    }
}
