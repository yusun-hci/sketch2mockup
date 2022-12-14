package com.example.sketch2mockup

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.example.sketch2mockup.PaintView.Companion.colorList
import com.example.sketch2mockup.PaintView.Companion.currentBrush
import com.example.sketch2mockup.PaintView.Companion.pathList

class MainActivity : AppCompatActivity() {

    companion object{
        var path = Path()
        var paintBrush = Paint()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val redBtn = findViewById<ImageButton>(R.id.redColor)
        val blueBtn = findViewById<ImageButton>(R.id.blueColor)
        val blackBtn = findViewById<ImageButton>(R.id.blackColor)
        val eraser = findViewById<ImageButton>(R.id.whiteColor)

        redBtn.setOnClickListener {
            currentBrush = Color.RED
            path = Path()
        }
        blueBtn.setOnClickListener {
            currentBrush = Color.BLUE
            path = Path()

        }
        blackBtn.setOnClickListener {
            currentBrush = Color.BLACK
            path = Path()

        }
        eraser.setOnClickListener {
            pathList.clear()
            colorList.clear()
            path.reset()
        }
    }
}