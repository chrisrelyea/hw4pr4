package com.example.swipedetect


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.GestureDetector
import android.view.MotionEvent
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.abs

class MainActivity : AppCompatActivity(), GestureDetector.OnGestureListener {
    private lateinit var gestureDetector: GestureDetector
    private val swipeThreshold = 100
    private val swipeVelocityThreshold = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gestureDetector = GestureDetector(this)
    }

    // Whenever the screen is touched, the app will determine what kind of
    // touch event happened

    override fun onTouchEvent(event: MotionEvent): Boolean {
        return if (gestureDetector.onTouchEvent(event)) {
            true
        }
        else {
            super.onTouchEvent(event)
        }
    }


    override fun onDown(p0: MotionEvent): Boolean {
        return false
    }

    override fun onShowPress(p0: MotionEvent) {
        return
    }

    override fun onSingleTapUp(p0: MotionEvent): Boolean {
        return false
    }

    override fun onScroll(p0: MotionEvent, p1: MotionEvent, p2: Float, p3: Float): Boolean {
        return false
    }

    override fun onLongPress(p0: MotionEvent) {
        return
    }


    // When a fling is detected, some geometry is used to detect swipe direction
    // This direction of the swipe is stored as "direction" variable
    override fun onFling(p0: MotionEvent, p1: MotionEvent, p2: Float, p3: Float): Boolean {
        Log.d("test", "Fling Detected!")


        var x1 = p0.x
        var y1 = p0.y
        var x2 = p1.x
        var y2 = p1.y
        var diffY = y2-y1
        var diffX = x2-x1
        var direction = ""

        direction = if (abs(diffY) > abs(diffX)) {
            if (y2 >= y1) {
                "DOWN"
            } else {
                "UP"
            }
        } else {
            if (x1 >= x2) {
                "LEFT"
            } else {
                "RIGHT"
            }
        }
        Log.d("direction", direction)
        var result = false

        Toast.makeText(this, direction, Toast.LENGTH_SHORT).show()

        return true

    }
}