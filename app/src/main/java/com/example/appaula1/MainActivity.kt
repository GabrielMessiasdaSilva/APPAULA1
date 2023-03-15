package com.example.appaula1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.app_com_implementao.R

class MainActivity : AppCompatActivity() {
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                val edtNome: EditText = findViewById(R.id.edtNome)
                val edtEndereco: EditText = findViewById(R.id.edtEndereco)
                val edtBairro: EditText = findViewById(R.id.edtBairro)
                val edtCep: EditText = findViewById(R.id.edtCep)
                val edtCidade: EditText = findViewById(R.id.edtCidade)
                val edtEstado: EditText = findViewById(R.id.edtEstado)
                val bntCadastrar: Button = findViewById(R.id.bntCadastrar)
                bntCadastrar.setOnClickListener{
                    val toast = Toast.makeText(this,edtNome.text.toString()
                            +"\n" +edtEndereco.text.toString()
                            +"\n" +edtBairro.text.toString()
                            +"\n" +edtCep.text.toString()
                            +"\n" +edtCidade.text.toString()
                            +"\n"+edtEstado.text.toString(), Toast.LENGTH_SHORT)
                    toast.show()
                }
            }
        }



