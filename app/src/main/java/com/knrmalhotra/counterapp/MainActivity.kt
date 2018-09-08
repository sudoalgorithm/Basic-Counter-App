package com.knrmalhotra.counterapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt_view_main.setText("" + counter)

        btn_increment.setOnClickListener {
            if (counter == 100){
                snakbarmessage("Max Score Can be 100")
            }else{
                increment()
            }
        }

        btn_decrement.setOnClickListener {
            if (counter == 0) {
                snakbarmessage("Score Can't Be Zero ")
            }else {
                decrement()
            }
        }

    }

    fun increment(){
        txt_view_main.setText("" + ++counter)
    }

    fun decrement(){
        txt_view_main.setText("" + --counter)
    }

    fun snakbarmessage(message: String){
        Snackbar.make(main_relative_layout, message, Snackbar.LENGTH_SHORT).show();
    }
}
