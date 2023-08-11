package com.example.hola_mundo

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.hola_mundo.databinding.ActivityMainBinding
import java.math.RoundingMode


class MainActivity : AppCompatActivity() {

    private  var mathOps  : MutableList<MathOperation> = ArrayList()// MutableList<MathOperation>(2, )
    private lateinit var binding: ActivityMainBinding
    lateinit var num1    : EditText
    lateinit var num2    : EditText
    lateinit var txtRes  : TextView



    private fun initRecyclerView(){

        var mathOp : Double


        /*
        Crear instancia MathOp
        Agregar instancia a Mathops
        Actualizar recycler view con datos MathOps
         */


    }

    fun calcular(operacion : View)
    {  val btn = operacion as Button
        if (num1.text == null || num1.text.isEmpty()) {
            txtRes.setText("Input null = 0" )
            return
        }




        if (num2.text == null || num2.text.isEmpty()){
            txtRes.setText("Input null = 0" )
            return
        }
        print(btn.text)

        val num1 = num1.text.toString().toDouble()
        val num2 = num2.text.toString().toDouble()
        var res : Double = 0.0
        when (btn.id){

            R.id.addBtn -> res = num1 + num2
            R.id.subBtn -> res = num1 - num2
            R.id.timesBtn -> res = num1 * num2
            R.id.divBtn -> res = (num1 / num2).toBigDecimal().setScale(1, RoundingMode.UP).toDouble()


        }
        txtRes.setText("${btn.text} = ${res}")
        mathOps.add(MathOperation(btn.text.toString()))
    }

    @SuppressLint("SuspiciousIndentation", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        num1 = findViewById(R.id.num1)
        num2 = findViewById(R.id.num2)
        txtRes = findViewById(R.id.txtRes)

        binding.addBtn.setOnClickListener (this :: calcular)
        binding.subBtn.setOnClickListener (this :: calcular)
        binding.timesBtn.setOnClickListener (this :: calcular)
        binding.divBtn.setOnClickListener (this :: calcular)
      /*  binding.holdBtn.setOnClickListener {
            recycler.refreshDrawableState()
        }*/



        /*Generar layout linear


        //Generar Array
        val data = ArrayList<lista>()
        //Pasar Array al adapter


        recycler.adapter = adapter
        */
        var recycler = findViewById<RecyclerView>(R.id.recycler)
        recycler.layoutManager = LinearLayoutManager(this)
        val adapter = CustomAdapter(mathOps)//.ViewHolder(mathOps)
        recycler.adapter = adapter
    }

}


