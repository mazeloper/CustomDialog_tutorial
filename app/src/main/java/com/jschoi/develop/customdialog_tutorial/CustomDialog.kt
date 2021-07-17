package com.jschoi.develop.customdialog_tutorial

import android.app.AlertDialog
import android.content.Context
import android.os.Handler
import android.view.MotionEvent
import android.view.View
import androidx.annotation.StringRes
import androidx.appcompat.widget.AppCompatButton

class CustomDialog(private val context: Context) {

    private val builder: AlertDialog.Builder by lazy {
        AlertDialog.Builder(context).setView(view)
    }

    private val view: View by lazy {
        View.inflate(context, R.layout.view_custom_dialog, null)
    }

    private var dialog: AlertDialog? = null

    /**
     * Touch Event Listener
     *
     */
    private val onTouchListener = View.OnTouchListener { _, motionEvent ->
        if (motionEvent.action == MotionEvent.ACTION_UP) {
            Handler().postDelayed({
                dismiss()
            }, 5)
        }
        false
    }

    fun setPositiveButton(
        /*@StringRes textId: Int,*/
        listener: (view: View) -> (Unit)
    ): CustomDialog {
        /* TODO Example
         val positiveButton = view.findViewById<AppCompatButton>(R.id.btn_ok)
        positiveButton.apply {
            setOnClickListener(listener)
            setOnTouchListener(onTouchListener)
        }
        */
        return this
    }

    fun setPositiveButton(text: CharSequence, listener: (view: View) -> (Unit)): CustomDialog {
        /* TODO Example
        view.positiveButton.apply {
            this.text = text
            setOnClickListener(listener)
        }
        */
        return this
    }


    fun setNegativeButton(@StringRes textId: Int, listener: (view: View) -> (Unit)): CustomDialog {
        // Do nothing..
        return this
    }


    fun setNegativeButton(text: CharSequence, listener: (view: View) -> (Unit)): CustomDialog {
        // Do nothing..
        return this
    }

    fun create() {
        dialog = builder.create()
    }

    fun show() {
        dialog = builder.create()
        dialog?.show()
    }

    fun dismiss() {
        dialog?.dismiss()
    }
}