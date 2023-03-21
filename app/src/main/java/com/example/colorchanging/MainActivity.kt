package com.example.colorchanging

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val spinner: Spinner = findViewById(R.id.spinner)

        val btnReset:Button = findViewById(R.id.btnReset)


        var menu = arrayOf("Choose a color","Red","Blue","Green")
        var color_chosen = ""
        val Background:ConstraintLayout = findViewById(R.id.background)



        spinner.adapter=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,menu)


        btnReset.setOnClickListener {
            Background.setBackgroundColor( Color.parseColor("#ffffff"))
            color_chosen=""
            btnReset.setBackgroundColor(Color.parseColor("#6200EE"))
            supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#6200EE")))
            spinner.setPopupBackgroundDrawable(ColorDrawable(Color.parseColor("#ffffff")))
            spinner.setBackgroundColor(Color.parseColor("#ffffff"))

            spinner.setSelection(0)
        }


        spinner.onItemSelectedListener = object:AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                color_chosen=menu.get(p2).toString()

                if (color_chosen =="Red") {

                    spinner.setBackgroundColor(Color.parseColor("#8b0000"))
                    Background.setBackgroundColor( Color.parseColor("#ff0000"))
                    btnReset.setBackgroundColor(Color.parseColor("#8b0000"))
                    supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#8b0000")))
                    spinner.setPopupBackgroundDrawable(ColorDrawable(Color.parseColor("#8b0000")))

                }
                else if(color_chosen == "Blue")
                {
                    spinner.setBackgroundColor(Color.parseColor("#00008b"))

                    Background.setBackgroundColor( Color.parseColor("#0000ff"))
                    btnReset.setBackgroundColor(Color.parseColor("#00008b"))
                    supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#00008b")))
                    spinner.setPopupBackgroundDrawable(ColorDrawable(Color.parseColor("#00008b")))


                }
                else if(color_chosen == "Green")
                {
                    spinner.setBackgroundColor(Color.parseColor("#008b00"))

                    Background.setBackgroundColor( Color.parseColor("#00ff00"))
                    btnReset.setBackgroundColor(Color.parseColor("#008b00"))
                    supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#008b00")))
                    spinner.setPopupBackgroundDrawable(ColorDrawable(Color.parseColor("#008b00")))



                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
        }





    }
