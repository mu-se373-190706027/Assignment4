package com.ermanyalcin.assignment4

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    val calendar = Calendar.getInstance()
    var year = calendar.get(Calendar.YEAR)
    var month = calendar.get(Calendar.MONTH)
    var day = calendar.get(Calendar.DAY_OF_MONTH)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @SuppressLint("SetTextI18n")
    fun pickDate(view: View){
        val textview = findViewById<TextView>(R.id.textView4)
        val listener = DatePickerDialog.OnDateSetListener { datePicker, mYear, mMonth, mDay, ->
            this.year = mYear
            this.month = mMonth+1
            this.day = mDay

            textview.setText("" + day + "." + month +"." + year)
        }
        val datePicker = DatePickerDialog(this, listener, year, month, day)
        datePicker.show()
    }
}