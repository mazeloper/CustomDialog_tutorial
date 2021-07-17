package com.jschoi.develop.customdialog_tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val btnShowDialog: Button by lazy {
        findViewById(R.id.btn_show_dialog)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showDialog()
    }

    private fun showDialog() {
        btnShowDialog.setOnClickListener {
            /* TODO Example
            CustomDialog(this).setPositiveButton {

            }.show()
             */
        }
    }
}