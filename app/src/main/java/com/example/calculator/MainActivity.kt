package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var etNumb1=findViewById<EditText>(R.id.etNUmb1)
        var etNumb2=findViewById<EditText>(R.id.etNumb2)
        var btnAdd=findViewById<Button>(R.id.btnAdd)
        var btnSub=findViewById<Button>(R.id.btnSub)
        var btnMod=findViewById<Button>(R.id.btnMod)
        var btnMult=findViewById<Button>(R.id.btnMult)
        var tvAnswer=findViewById<TextView>(R.id.tvAnswer)

        btnMult.setOnClickListener{
            if (etNumb1.text.toString()==""){
                Toast.makeText(baseContext,"Enter a number",Toast.LENGTH_LONG).show()
            }
            else if(etNumb1.text.toString()==""){
                Toast.makeText(baseContext,"Enter a number", Toast.LENGTH_SHORT).show()
            }
            else{
                var etNumb1=etNumb1.text.toString().toInt()
                var etNumb2=etNumb2.text.toString().toInt()
                var multiply=etNumb1*etNumb2
                tvAnswer.text="Answer${multiply}"
            }
        }

        btnAdd.setOnClickListener{
            if (etNumb1.text.toString()==""){
                Toast.makeText(baseContext,"Enter a number",Toast.LENGTH_LONG).show()
            }
            else if(etNumb1.text.toString()==""){
                Toast.makeText(baseContext,"Enter a number", Toast.LENGTH_SHORT).show()
            }
            else{
                var etNumb1=etNumb1.text.toString().toInt()
                var etNumb2=etNumb2.text.toString().toInt()
                var add=etNumb1+etNumb2
                tvAnswer.text="Answer${add}"
            }
        }

        btnSub.setOnClickListener{
            if (etNumb1.text.toString()==""){
                Toast.makeText(baseContext,"Enter a number",Toast.LENGTH_LONG).show()
            }
            else if(etNumb1.text.toString()==""){
                Toast.makeText(baseContext,"Enter a number", Toast.LENGTH_SHORT).show()
            }
            else{
                var etNumb1=etNumb1.text.toString().toInt()
                var etNumb2=etNumb2.text.toString().toInt()
                var subtract=etNumb1-etNumb2
                tvAnswer.text="Answer${subtract}"
            }
        }

        btnMod.setOnClickListener{
            if (etNumb1.text.toString()==""){
                Toast.makeText(baseContext,"Enter a number",Toast.LENGTH_LONG).show()
            }
            else if(etNumb1.text.toString()==""){
                Toast.makeText(baseContext,"Enter a number", Toast.LENGTH_SHORT).show()
            }
            else{
                var etNumb1=etNumb1.text.toString().toInt()
                var etNumb2=etNumb2.text.toString().toInt()
                var modulus=etNumb1%etNumb2
                tvAnswer.text="Answer${modulus}"
            }
        }





    }
}