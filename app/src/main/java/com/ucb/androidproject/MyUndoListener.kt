package com.ucb.androidproject

import android.util.Log
import android.view.View

class MyUndoListener: View.OnClickListener {
    override fun onClick(p0: View) {
        Log.d("TEST", "UNDO PRESSED")
    }
}