package br.com.fiap.minhabibliotecaapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import br.com.fiap.minhabiblioteca.Calculadora
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calc = Calculadora()
        val resultado = calc.somar(1,1)

        Toast.LENGTH_LONG.toString(resultado).toShort()



        Log.ERROR.toString(resultado)

    }
}
